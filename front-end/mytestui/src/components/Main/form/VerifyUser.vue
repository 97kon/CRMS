<template>
    <div class="box">
        <div class="steps">
            <el-steps :active="2" finish-status="success">
                <el-step title="申请"></el-step>
                <el-step title="审核"></el-step>
                <el-step title="验收"></el-step>
            </el-steps>
        </div>
        <h3>验证申请</h3>
        <div class="nav">
            <div class="position">
                <p>位置：</p>
                <el-select v-model="values"  class="m-2" placeholder="Please select" style="margin-top: 10px; width: 300px">
                    <el-option label="A3" value="1"></el-option>
                    <el-option label="A4" value="2"></el-option>
                    <el-option label="A5" value="3"></el-option>
                    <el-option label="A6" value="4"></el-option>
                    <el-option label="A7" value="5"></el-option>
                </el-select>
            </div>
            <div class="day">
                <p>日期：</p>
                <el-date-picker v-model="day" type="date" placeholder="Pick a day" value-format="YYYY-MM-DD" :size="size" style="margin-top: 10px; width: 300px"/>
<!--                <el-input placeholder="例：4/9"></el-input>-->
            </div>
        </div>
        <div class="table">
            <el-table :data="filteredData" stripe="true" style="width: 100%">
                <el-table-column prop="id" label="ID" width="" />
                <el-table-column prop="applyClass" label="教室" width=""/>
                <el-table-column prop="applyDay" label="日期" width=""/>
                <el-table-column prop="applyTime" label="时间" width=""/>
                <el-table-column prop="applyUnit" label="申请单位" width=""/>
                <el-table-column prop="applyStuClass" label="申请班级" width=""/>
                <el-table-column prop="verifyCode" label="验证码" width=""/>
                <el-table-column label="操作" width="100px">
                    <template #default="scope">
                        <el-button size="small" type="success" @click="pass(scope.row)">已处理</el-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>
    </div>
</template>

<script>
import {ElTable} from "element-plus";
import axios from "axios";

export default {
    name: "VerifyUser",
    components: {ElTable},
    data(){
        return{
            day:'',
            tableData:[
                // {id:1,applyClass:"A7-202",applyDay:"2023-06-01",applyTime:"第一大节",applyUnit:"软件技术", applyStuClass:"21101班",verifyCode:465122},
                // {id:2,applyClass:"A7-104",applyDay:"2023-06-02",applyTime:"第三大节",applyUnit:"软件技术", applyStuClass:"21105班",verifyCode:785444},
            ]
        }
    },
    created() {
        let _this = this
        this.$axios.post('/api/VerifyuserData?status='+2).then(function (resp){
            _this.tableData = resp.data.data
        })
            .catch(function (error){
                console.log(error)
            })
    },
    computed:{
        filteredData(){
            console.log(this.day)
            if (!this.day) {
                return this.tableData
            }
            return this.tableData.filter(item => item.applyDay === this.day)
        }
    },
    methods:{
        pass(row){
            // const data = {id: row.ID};
            const _this = this;

            axios.post('/api/passData?id='+row.id).then(function (response){
                if (response.data){
                    _this.$message.success("处理成功");
                }else {
                    _this.$message.error("处理失败");
                }
                // 刷新数据
                _this.fetchData();
            })
                .catch(function (error){
                    console.log(error);
                })
        }
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
h3{
    text-align: center;
    padding-bottom: 40px;
    border-bottom: 1px #BCBCBC solid;
}
.steps{
    padding-top: 20px;
}
.position{
    display: flex;
    flex-direction: row;
    padding-right: 20px;
}
.day{
    display: flex;
    flex-direction: row;
}
.position > p{
    width: 50px;
}
.day > p{
    width: 60px;
}
.nav{
    display: flex;
    flex-direction: row;
    border-bottom: 1px #BCBCBC solid;
    padding-bottom: 30px;
}
.table{
    margin-top: 20px;
}
</style>