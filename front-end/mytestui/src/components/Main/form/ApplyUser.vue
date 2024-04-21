<template>
    <div class="box">

        <div class="steps">
        <el-steps :active="0" finish-status="success">
            <el-step title="申请"></el-step>
            <el-step title="审核"></el-step>
            <el-step title="验收"></el-step>
        </el-steps>
        </div>
        <h3>教室申请使用表</h3>
        <div class="box1">
            <el-form :model="form"  ref="form">
                <el-form-item label="申请单位:" prop="applyUnit" :rules="[
                    {required: true, message: '请输入您的单位', trigger: '[change,blur]'},
                ]">
<!--                <div class="danwei">-->
<!--                    <p>申请单位:</p>-->
                    <el-input v-model="form.applyUnit" placeholder="例：软件技术"></el-input>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="学生班级:" prop="applyStuClass" :rules="[
                    {required: true, message: '请输入你的班级号', trigger: '[change,blur]'}
                ]">
<!--                <div class="class">-->
<!--                    <p>学生班级:</p>-->
                    <el-input v-model="form.applyStuClass" placeholder="例：21101"></el-input>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="学生人数:" prop="applyPeopleNum" :rules="[
                    {required: true, message:'学生人数不能为零', trigger: '[change,blur]'}
                ]">
<!--                <div class="person_num">-->
<!--                    <p>学生人数:</p>-->
        <!--            <el-input placeholder="例：100"></el-input>-->
                    <el-slider v-model="form.applyPeopleNum" style="width: 450px" ref="slider" :min="min" :max="max" :step="step" :show-input="true" :show-stops="true" @change="sliderchange" ></el-slider>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="教室数量:" prop="applyClassNum" :rules="[
                    {required: true, message:'需要教室的数量不能为0', trigger:'[change,blur]'}
                ]">
<!--                <div class="class_num">-->
<!--                    <p>需教室数量:</p>-->
        <!--            <el-input placeholder="例：1"></el-input>-->
                    <el-slider v-model="form.applyClassNum" style="width: 450px" ref="slider" :min="1" :max="5" :step="1" :show-input="true" :show-stops="true" @change="sliderchange" ></el-slider>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="申请教室:" prop="applyClass" :rules="[
                    {required: true, message:'所申请的教室不能为空', trigger:'[change,blur]'}
                ]">
<!--                <div class="apply_class">-->
<!--                    <p>申请教室:</p>-->
                    <el-input v-model="form.applyClass" placeholder="例：A7-202"></el-input>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="申请日期:" prop="applyDay" :rules="[
                    {required: true, message: '日期不能为空',trigger:'[change,blur]'},
                    // {type: 'date', message: '请输入正确的日期格式',trigger:'blur'}
                ]">
                    <el-date-picker v-model="form.applyDay" type="date" placeholder="Pick a day" value-format="YYYY-MM-DD"  style="margin-top: 10px; width: 300px"/>
                </el-form-item>
                <el-form-item label="申请时间:" prop="applyTime" :rules="[
                     {required: true, message:'时间不能为空',trigger:'[change,blur]'}
                ]">
                    <el-checkbox-group v-model="form.applyTime" style="width: 350px;">
                        <el-checkbox label="第一大节" name="1"  />
                        <el-checkbox label="第二大节" name="2" />
                        <el-checkbox label="第三大节" name="3" />
                        <el-checkbox label="第四大节" name="4" />
                        <el-checkbox label="第五大节" name="5" />
                        <el-checkbox label="第六大节" name="6" />
                    </el-checkbox-group>
                </el-form-item>
                <el-form-item label="申请人:" prop="applyUser" :rules="[{
                    required: true, message:'申请人姓名不能为空',trigger:'[change,blur]'
                }]">
<!--                <div class="apply_person">-->
<!--                    <p>申请人:</p>-->
                    <el-input v-model="form.applyUser" placeholder="例：张三"></el-input>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="学号:" prop="stuId" :rules="[{
                    required: true, message:'学号不能为空',trigger:'[change,blur]'
                }]">
                    <!--                <div class="apply_person">-->
                    <!--                    <p>申请人:</p>-->
                    <el-input v-model="form.stuId" placeholder="例：21067010122"></el-input>
                    <!--                </div>-->
                </el-form-item>
                <el-form-item label="联系电话:" prop="applyPhone" :rules="[
                    {required: true, message:'联系电话', trigger:'[change,blur]'}
                ]">
<!--                <div class="phone_num">-->
<!--                    <p>联系电话:</p>-->
                    <el-input v-model="form.applyPhone" placeholder="例：13980194399"></el-input>
<!--                </div>-->
                </el-form-item>
                <el-form-item label="使用原因:" prop="applyReason" :rules="[
                    {required: true, message:'使用原因不能为空',trigger:'[change,blur]'}
                ]">
<!--                <div class="note">-->
<!--                    <p>使用原因:</p>-->
                    <el-input v-model="form.applyReason" type="textarea" :autosize="{ minRows: 3, maxRows: 5}" placeholder="Enter some text"></el-input>
<!--                </div>-->
                </el-form-item>
                <div class="submit">
                    <el-button type="primary" @click="onsubmit" style="width: 380px">submit</el-button>
                </div>
            </el-form>
        </div>
    </div>
</template>

<script>
// import axios from "axios";

import axios from "axios";

export default {
    name: "ApplyUser",

    data(){
        // applyTime = JSON.stringify(applyTime),
        // applyTime = JSON.stringify(applyTimeArr)
        return{
            // applyTimeArr:[],

            form:{
                id:0,
                applyUnit:'',
                applyDay:'',
                applyTime:[],
                applyStuClass:'',
                applyPeopleNum:'',
                applyClassNum:'',
                applyClass:'',
                applyUser:'',
                stuId: '',
                applyPhone:'',
                applyReason:'',
                status:1,
            },
            // rules:{
            //     // unit: [
            //     //     {required: true, message: '请输入您的单位', trigger: 'blur'},
            //     // ],
            //     stuclass: [
            //         {required: true, message: '请输入你的班级号', trigger: 'blur'}
            //     ],
            //     peopleNum:[
            //         {required:true, message:'人数不能为空',trigger: 'blur'}
            //     ],
            //     classNum:[
            //         {required: true, message:'教室数量不能为空',trigger:'blur'}
            //     ],
            //     class:[
            //         {required: true, message:'申请的教室不能为空',trigger:'blur'}
            //     ],
            //     user:[
            //         {required: true, message: '申请人姓名不能为空',trigger:'blur'}
            //     ],
            //     phone:[
            //         {required: true, message:'申请人联系电话不能为空',trigger:'blur'},
            //         {min:11, max:11, message: '请输入正确的号码位数', trigger: "blur"}
            //     ],
            //     reason:[
            //         {required: true,message:'使用原因不能为空', trigger:'change'}
            //     ]
            //
            //
            //
            // }
        }
    },
    props:{
        min:{
            type:Number,
            default: 0,
            required: true,
        },
        max:{
            type:Number,
            default: 100,
            required: true,
        },
        step:{
            type:Number,
            default: 1,
        },
        value:{
            type:Number,
            default:0,
        }
    },
    methods:{
        sliderchange(val) {
            this.$emit("update:value", val)
            },
        onsubmit(){
            // eslint-disable-next-line no-unused-vars
            let _this = this
            this.$refs.form.validate((valid) => {
                if (valid){
                    this.form.applyTime = JSON.stringify(this.form.applyTime);
                    axios.post('/api/applyuser',this.form).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            _this.$alert("申请提交成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/index')}})
                        }
                    }).catch(function (error){
                        console.log(error)
                    })
                    console.log(this.form)
                    this.$emit('submit',this.form)
                }
            });
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
.steps{
    /*width: 400px;*/
    /*width: 600px;*/
    padding-top: 20px;
    /*border: 1px black solid;*/
    text-align: left;
    /*margin: auto;*/
}
.box1{
    width: 600px;
    margin: auto;
    /*border: 1px black solid;*/
}
.danwei,.class_num , .apply_class,.apply_person, .phone_num, .note{
    display: flex;
    flex-direction: row;
    width: 500px;
}
.danwei >p,.class_num >p , .apply_class > p,.apply_person > p, .phone_num > p, .note > p{
    width: 150px;
    /*text-align: right;*/
}
.class{
    display: flex;
    flex-direction: row;
    width: 500px;
}
.class > p{
    width: 150px;
}
.person_num{
    display: flex;
    flex-direction: row;
    width: 500px;
}
.person_num > p{
    width: 150px;
}
.submit{
    padding-top: 20px;
    /*width: 300px;*/
}
</style>