<template>
    <div class="box">
        <h2>个人申请中心</h2>
        <div class="nav">
            <p>请选择申请状态：</p>
            <el-select v-model="values"  class="m-2" placeholder="未通过" style="width: 300px">
                <el-option label="已通过" value="2"></el-option>
                <el-option label="未通过" value="3"></el-option>
                <el-option label="待审核" value="1"></el-option>

            </el-select>
        </div>
        <div class="table">
            <el-table :data="filteredData" stripe="true" style="width: 100%">
                <el-table-column prop="id" label="序号" width=""/>
                <el-table-column prop="applyClass" label="教室" width=""/>
                <el-table-column prop="applyDay" label="日期" width=""/>
                <el-table-column prop="applyTime" label="时间" width=""/>
                <el-table-column prop="applyUnit" label="申请单位" width=""/>
                <el-table-column prop="applyStuClass" label="申请班级" width=""/>
                <el-table-column prop="verifyCode" label="验证码" width=""/>
                <el-table-column prop="status" label="申请状态" width="200px">
                    <template #default="{row}">
                        <el-button v-if="row.status === 2" type="success">已通过</el-button>
                        <el-button v-if="row.status === 3" type="danger"  >未通过</el-button>
                        <el-button v-if="row.status === 1" type="warning"  >待审核</el-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>
    </div>
</template>

<script>
import {ElTable} from "element-plus";
import {store} from "@/store/store";
// import {mapGetters} from "vuex";
// import axios from "axios";

export default {
    name: "PrivateApplication",
    components: {ElTable},
    data(){
        return {
            store,
            // userName:'',
            values:0,
            tableData:[
                // {
                //     id:10001,
                //     applyClass:"A7-202",
                //     applyDay:"2023-06-01",
                //     applyTime:"第一大节",
                //     applyUnit:"软件技术系",
                //     applyStuClass:"21101班",
                //     status:1,
                // },
                // {
                //     id:10002,
                //     applyClass: "A7-302",
                //     applyDay: "4/23",
                //     applyTime:"第六大节",
                //     applyUnit: "计算机网络与技术系",
                //     applyStuClass: "21102班",
                //     status:2,
                // },
                // {
                //     id:10003,
                //     applyClass: "A7-302",
                //     applyDay: "4/23",
                //     applyTime:"第六大节",
                //     applyUnit: "计算机网络与技术系",
                //     applyStuClass: "21102班",
                //     status:3,
                // }
            ]
        }
    },
    created() {
        let _this = this
        this.$axios.post('/api/privateapplicationData?stuId='+store.userName).then(function (resp){
            _this.tableData = resp.data.data
        })
            .catch(function (error){
                console.log(error)
            })
        // this.getUserName = this.userName
    },
    computed:{
        filteredData() {
            switch (this.values) {
                case '2': // 已通过
                    return this.tableData.filter(item => item.status === 2);
                case '3': // 未通过
                    return this.tableData.filter(item => item.status === 3);
                case '1': // 待审核
                    return this.tableData.filter(item => item.status === 1);
                default:
                    return this.tableData;
            }
        },
        // ...mapGetters(["getUserName"])
    }
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
h2{
    text-align: center;
}
.nav{
    display: flex;
    flex-direction: row;
    border-bottom: 1px #BCBCBC solid;
    padding-bottom: 20px;
    margin-bottom: 20px;
}
.nav > p{
    padding-right: 20px;
}
</style>