<template>
    <div class="box">
        <div class="steps">
            <el-steps :active="1" finish-status="success">
                <el-step title="申请"></el-step>
                <el-step title="审核"></el-step>
                <el-step title="验收"></el-step>
            </el-steps>
        </div>
        <div class="table">
            <el-table :data="tableData" stripe="true" style="width: 100%">
                <el-table-column prop="id" label="ID" width="" />
                <el-table-column prop="type" label="申请类型" width="" />
                <el-table-column prop="company" label="申请单位" width="" />
                <el-table-column prop="status" label="当前状态" width=""/>
            </el-table>
        </div>
        <div class="line"></div>
        <div class="box_one">
                <div class="danwie"><p>申请单位：{{danweiID}}</p></div>
                <div class="class_stu"><p>学生班级：{{classStu}}</p></div>
                <div class="stu_num"><p>学生人数：{{stuNum}}</p></div>
                <div class="classroom_num"><p>需教室数量：{{classroomNum}}</p></div>
                <div class="which_class"><p>申请教室：{{applyClass}}</p></div>
                <div class="apply_person"><p>申请人：{{applyPerson}}</p></div>
                <div class="phone"><p>联系电话：{{phoneNum}}</p></div>
                <div class="note"><p>使用原因：{{useNote}}</p></div>
        </div>
        <div class="line"></div>
        <div class="button">
            <el-button type="success" style="width: 100px">通过</el-button>
            <el-button type="danger" style="width: 100px">未通过</el-button>
        </div>
    </div>

</template>

<script>
import {ElTable, ElTableColumn} from "element-plus";

export default {
    name: "AuditUserShow",
    components: {ElTable, ElTableColumn},
    data(){
        return{
            danweiID: "软件技术系",
            classStu:"21101班",
            stuNum:50,
            classroomNum:1,
            applyClass:"A7-202",
            applyPerson:"刘启铭",
            phoneNum:13980194399,
            useNote:"团组织生活",
            // formData:[{
            //     danweiID: "软件技术系",
            //     classStu:"21101班",
            //     stuNum:50,
            //     classroomNum:1,
            //     applyClass:"A7-202",
            //     applyPerson:"刘启铭",
            //     phoneNum:13980194399,
            //     useNote:"团组织生活",
            // },],
            tableData:[
                {id:100001, type:'借教室', company:'软件技术一班', status:'未审核'},
            ]
        }
    },
    methods:{

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
.steps{
    padding-top: 20px;
}
.table{
    padding-top: 20px;
}
.line{
    padding-top: 50px;
    width: 100%;
    border-bottom: 1px black solid;
}
.button{
    /*display: flex;*/
    padding-top: 20px;
    text-align: center;
}
</style>