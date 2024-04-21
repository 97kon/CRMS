<template>
    <div class="box">
        <h3>社团组员活动空闲时间表</h3>
<!--        此处输出一个社团成员的空闲时间表 6行七列 -->
        <div class="output_table">
            <el-table :data="tableData" border style="width: 100%">
                <el-table-column prop="time" label="时间段" width=""/>
                <el-table-column prop="Mon" label="星期一" width=""/>
                <el-table-column prop="Tus" label="星期二" width=""/>
                <el-table-column prop="Wen" label="星期三" width=""/>
                <el-table-column prop="Tru" label="星期四" width=""/>
                <el-table-column prop="Fri" label="星期五" width=""/>
            </el-table>
        </div>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "KjsOutput",
    created() {
        let _this = this
        axios.get('https://localhost:8080/kjsoutput/output').then(function (resp){
            _this.tableData = resp.data
        })
            .catch(function (error){
                console.log(error)
            })
    },
    data(){
        return {
            tableData:
                [
                // 第一大节
                {time:"第一大节",Mon: "刘启铭",Tus:"许清波",Wen:"刘启铭",Tru:"刘启铭",Fri:"许清波"},
            //     第二大节
                {time:"第二大节",Mon: "null",Tus:"刘启铭",Wen:"刘启铭",Tru:"许清波",Fri:"许清波"},
            //     第三大节
                {time:"第三大节",Mon: "刘启铭",Tus:"null",Wen:"null",Tru:"许清波",Fri:"null"},
            //     第四大节
                {time:"第四大节",Mon: "null",Tus:"刘启铭",Wen:"null",Tru:"null",Fri:"null"},
            //     第五大节
                {time:"第五大节",Mon: "刘启铭",Tus:"null",Wen:"许清波",Tru:"null",Fri:"许清波"},
            //     第六大节
                {time:"第六大节",Mon: "null",Tus:"null",Wen:"许清波",Tru:"null",Fri:"许清波"}
            ],
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
    text-align: center;
}
h3{
    padding-bottom: 30px;
    padding-top: 30px;
}
</style>