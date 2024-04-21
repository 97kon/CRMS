<template>
    <div class="box">
        <h3>请输入有效数据</h3>
<!--        <div class="people_num">-->
<!--            <p>成员人数:</p>-->
        <el-form :model="form" ref="form">
            <el-form-item label="成员人数:  " prop="num" :rules="[
                {required:true, message:'人数不能为空',trigger: 'blur'},
                {type:'number', messgae:'必须为数字', trigger: 'blur'}
            ]">
                <el-slider  v-model="form.num" style="width: 450px" ref="slider" :min="min" :max="max" :step="step" :show-input="true" :show-stops="true" @change="sliderchange" ></el-slider>
            </el-form-item>
<!--        </div>-->
<!--        <div class="people_classnum">-->
<!--            <p>成员学号:</p>-->
            <el-form-item label="成员学号:  " prop="stuIdArray" :rules="[
                {required:true, message:'学号不能为空',trigger: 'blur'},
                // {type: 'array', required: true, message: '输入形式是数组', trigger:'blur'}
            ]">
                <el-input v-model="form.stuIdArray" type="textarea"  :autosize="{ minRows: 3, maxRows: 5}" placeholder="例：21067010122；21067010222；"></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onsubmit" style="margin: auto">Submit</el-button>
            </el-form-item>
<!--</div>-->
        </el-form>
    </div>
</template>

<script>
// import { FormInstance,FormRules} from "element-plus";
// import axios from "axios";
export default {
    name: "KjsInput",
    props:{
        min:{
            type:Number,
            default: 1,
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
    data(){
        return {
            form:{
                num: 0,
                stuIdArray:''
            },

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
                    _this.$axios.post('/api/kjsoninput?num='+this.form.num+'&stuIdArray='+this.form.stuIdArray).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            _this.$alert("数据提交成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/KjsOutput')}})
                        }
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
.people_num{
    display: flex;
    flex-direction: row;
}
.people_num > p{
    width: 150px;
    /*border: 1px black solid;*/
    /*margin-right: 30px;*/
    /*padding-right: 20px;*/
    /*margin-left: 20px;*/
    padding-left: 20px;
    text-align: left;
}
.people_classnum{
    display: flex;
    flex-direction: row;
}
.people_classnum > p{
    width: 150px;
    /*border: 1px black solid;*/
    /*margin-right: 50px;*/
    text-align: left;
    /*padding-right: 20px;*/
    padding-left: 20px;
}
</style>