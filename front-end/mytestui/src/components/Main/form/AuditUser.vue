<template>
  <div class="box">
   <div class="steps">
    <el-steps :active="1" finish-status="success">
     <el-step title="申请"></el-step>
     <el-step title="审核"></el-step>
     <el-step title="验收"></el-step>
    </el-steps>
   </div>

   <div class="nav">
<!--    <p>申请状态:</p>-->
<!--    <el-select v-model="values"  class="m-2" placeholder="未审核" style="width: 300px">-->
<!--     <el-option label="审核通过" value="1"></el-option>-->
<!--     <el-option label="审核未通过" value="2"></el-option>-->
<!--     <el-option label="未审核" value="3"></el-option>-->
<!--    </el-select>-->
       <p>日期：</p>
       <el-date-picker v-model="day" type="date" placeholder="Pick a day" value-format="YYYY-MM-DD" :size="size" style="margin-top: 10px; width: 300px"/>
   </div>
   <div class="line"></div>
   <div class="table">
    <el-table :data="filteredData" stripe="true" style="width: 100%">
<!--     <el-table-column prop="id" label="ID" width="" />-->
<!--     <el-table-column prop="type" label="申请类型" width="" />-->
<!--     <el-table-column prop="company" label="申请单位" width="" />-->
<!--     <el-table-column prop="status" label="当前状态" width=""/>-->
     <el-table-column type="expand">
      <template #default="props">
       <div m="8">
           <p m="t-0 b-2">申请人: {{ props.row.applyUser }}</p>
          <p m="t-0 b-2">申请专业: {{props.row.applyUnit }}</p>
          <p m="t-0 b-2">申请班级: {{ props.row.applyStuClass }}</p>
          <p m="t-0 b-2">申请教室: {{ props.row.applyClass }}</p>
          <p m="t-0 b-2">学生人数: {{ props.row.applyPeopleNum }}</p>
          <p m="t-0 b-2">教室数量: {{ props.row.applyClassNum }}</p>
           <p m="t-0 b-2">联系电话: {{ props.row.applyPhone }}</p>
           <p m="t-0 b-2">申请理由: {{ props.row.applyReason }}</p>
       </div>
      </template>
     </el-table-column>
     <el-table-column label="id" prop="id" />
     <el-table-column label="申请日期" prop="applyDay" :formatter="formatDate"/>
     <el-table-column label="申请时间" prop="applyTime" />
     <el-table-column label="当前状态" prop="status" />
        <el-table-column label="操作">
            <template #default="scope">
                <el-button type="success" size="small" @click="pass(scope.row)" style="width: 70px">通过</el-button>
                <el-button type="danger" size="small" @click="reject(scope.row)" style="width: 70px">未通过</el-button>
            </template>
        </el-table-column>
    </el-table>
   </div>
  </div>

</template>

<script>
import {ElTable, ElTableColumn} from "element-plus";
import axios from "axios";

// let filtered;
export default {
    name: "AuditUser",
 components:{
     ElTableColumn,
     ElTable
 },
  data(){
     return{
         day:'',
      tableData: [

          // {
          //     ID:0,
          //     applyDay:'',
          //     applyTime:'',
          //     status:0,
          //     applyUser:'',
          //     applyUnit:'',
          //     applyStuClass:'',
          //     applyClass:'',
          //     applyPeopleNum: '',
          //     applyClassNum:'',
          //     applyPhone:'',
          //     applyReason: ''
          // },

          // {
          //     ID:0,
          //     applyDay:'2023-06-09',
          //     applyTime:'第一大节',
          //     status:1,
          //     applyUser:'刘启铭',
          //     applyUnit:'软件技术',
          //     applyStuClass:'21101',
          //     applyClass:'A7-202',
          //     applyPeopleNum: '50',
          //     applyClassNum:'1',
          //     applyPhone:'13980194399',
          //     applyReason: '上团课'
          // },
          // {
          //     ID:1,
          //     applyDay:'2023-06-09',
          //     applyTime:'第一大节',
          //     status:1,
          //     applyUser:'刘启铭',
          //     applyUnit:'软件技术',
          //     applyStuClass:'21101',
          //     applyClass:'A7-202',
          //     applyPeopleNum: '50',
          //     applyClassNum:'1',
          //     applyPhone:'13980194399',
          //     applyReason: '上团课'
          // }

      ]
/*下面的数据是前端界面实现时候测试表格写死的数据*/
       // {id:100001, type:'借教室', company:'软件技术一班', status:'未审核'},
       // {id:100002, type:'借教室', company:'软件技术四班', status:'未审核'},
       // {id:100003, type:'借教室', company:'软件技术六班', status:'未审核'},
       // {id:100004, type:'借教室', company:'软件技术二班', status:'未审核'},
     };
  },
 created() {
  let _this = this
  this.$axios.post('/api/audituser/?status='+1).then(function (resp){
   _this.tableData = resp.data.data
  })
      .catch(function (error){
       console.log(error)
      })
 },
    methods: {
        // 通过按钮的方法实现
        pass(row) {
            // const data = {id: row.ID,status: 2};
            const _this = this;
            console.log(row.ID)
            axios.post('/api/auditupdata?id=' + row.id + "&status=" + 2).then(function (response) {
                if (response.data) {
                    _this.$message.success("通过成功");
                } else {
                    _this.$message.error("通过失败");
                }
                // 刷新数据
                _this.fetchData();
            })
                .catch(function (error) {
                    console.log(error);
                })
        },
        // 未通过按钮的方法实现
        reject(row) {
            // const data = {id: row.ID, status:3};
            const _this = this;

            axios.post('/api/auditupdata?id=' + row.id + "&status=" + 3).then(function (response) {
                if (response.data) {
                    _this.$message.success("未通过成功");
                } else {
                    _this.$message.error("未通过失败");
                }
                _this.fetchData();
            })
                .catch(function (error) {
                    console.log(error);
                })
        },
        // formatDate(row, column) {
        //     // 获取单元格数据
        //     let data = row[column.property]
        //     if (data == null) {
        //         return null
        //     }
        //     let dt = new Date(data)
        //     let year = dt.getFullYear()
        //     let month = (dt.getMonth() + 1) < 10 ? '0' + (dt.getMonth() + 1) : (dt.getMonth() + 1)
        //     let date = dt.getDate() < 10 ? '0' + dt.getDate() : dt.getDate()
        //     // eslint-disable-next-line no-unused-vars
        //     return year + '-' + month + '-' + date
        // },

    },
    computed:{
        filteredData(){
            console.log(this.day)
            if (!this.day) {
                return this.tableData
            }
            return this.tableData.filter(item => item.applyDay === this.day)
        },
        filtered() {
            const filtered = this.tableData.filter(item => {

                // eslint-disable-next-line no-undef
            const applyDay = formatDate(item, {property: 'applyDay'})
            const date = new Date(applyDay)
            const dateString = date.toISOString().split('T')[0] // 取 ISO 日期字符串的前 10 位字符即可
            return dateString === this.day
        })
        return filtered
    }

    }

  // mounted() {
  //    axios.get('https://localhost:808/api/tabledata').then((response) => {
  //     this.tableData = response.data;
  //    }).catch((error) => {
  //     console.log(error)
  //    })
  // }
}
</script>

<style scoped>
.box{
 /*border: 1px black solid;*/
 /*margin: 20px;*/
 padding-bottom: 20px;
 padding-left: 20px;
 padding-right: 20px;
 border-radius: 20px;
 background-color: #F6F8FA;
 border: #BCBCBC 1px solid;
}
.steps {
 padding-top: 20px;
}
.nav{
 padding-top: 50px;
 text-align: center;
 display: flex;
 flex-direction: row;
}
.nav > p{
 width: 100px;
}
.line{
 /*height: 50px;*/
 border-bottom: 1px black solid;
}
</style>