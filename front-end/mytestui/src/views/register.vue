<template>
    <div class="box">
        <img id="logo_crms" src="../assets/logo(CRMS).png">
        <h1>Sign up to CRMS</h1>
        <el-form :model="form" ref="form">
            <div class="box1">
            <div class="quanxian">
                <p>Please select an account category:</p>
                <el-form-item prop="type" :rules="[
                    {required: true, message:'权限不能为空', trigger:['blur', 'change']}
                ]">
                    <el-select v-model="form.type" class="m-2" placeholder="Please select" style="width: 350px">
                        <el-option label="type_one" value="1"></el-option>
                        <el-option label="type_two" value="2"></el-option>
                        <el-option label="type_three" value="3"></el-option>
                    </el-select>
                </el-form-item>
            </div>
            <div class="input_acount">
                <p>Please enter the account number:</p>
                <el-form-item prop="userName" :rules="[
                    {required: true, message: '账号不能为空', trigger: ['blur', 'change']},
                    {min:11, max:11, message: '账号必须为11位', trigger: ['blur', 'change']},
                    // {type: 'number', message: '账号必须为学号', trigger: 'blur'}
                ]">
                    <el-input v-model="form.userName"></el-input>
                </el-form-item>
            </div>
            <div class="input_pwd">
                <p>Please enter password:</p>
                <el-form-item prop="pwd" :rules="[
                    {required: true, message:'密码不能为空', trigger: ['blur', 'change']}
                ]">
                    <el-input v-model="form.pwd"></el-input>
                </el-form-item>
            </div>
            <div class="input_email">
                <p>Please enter email:</p>
                <el-form-item prop="stuMail" :rules="[
                    {required: true, message: '邮箱不能为空', trigger: ['blur', 'change']},
                    { type: 'email', message: '请输入正确的邮箱格式', trigger: ['blur', 'change'] }
                ]">
                    <el-input v-model="form.stuMail"></el-input>
                </el-form-item>
            </div>
            <div class="verification_code">
                <div class="ver_code_one">
                <p>Please enter the verification code:</p>
                    <el-form-item prop="verCode" :rules="[
                        {required: true, message:'验证码不能为空', trigger:['blur', 'change']}
                    ]">
                        <el-input v-model="form.verCode"></el-input>
                    </el-form-item>
                </div>
                <div class="ver_code_two">

                        <el-button type="primary" plain @click="getCode">get code</el-button>

                </div>
            </div>
            <div class="sign_up">
                <el-button @click="onsubmit" type="primary" style="width: 350px">Sign up</el-button>
            </div>
            <div class="footer">
                <p>Existing account？</p>
                <router-link to="/login"><a href="">Log in immediately</a></router-link>
            </div>
        </div>
        </el-form>
    </div>
</template>

<script>

// import axios from "axios";

export default {

    // eslint-disable-next-line vue/multi-word-component-names
    name: "register",
    data(){
        return{
            value:'',
            form: {
                id:0,
                userName:'',
                pwd:'',
                stuId :'',
                type:'',
                stuMail:'',
                verCode:'',
            }
        };
    },
    methods:{
        onsubmit(){
            let _this = this
            this.form.stuId = this.form.userName
            this.$refs.form.validate((valid) => {
                if (valid){
                    console.log(this.form.stuMail)
                    console.log(this.form.verCode)
                    _this.$axios.post('/api/register?stuMail='+this.form.stuMail+'&verCode='+this.form.verCode).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            _this.$alert("注册成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/login')}})
                            console.log("users提交成功")
                        }
                    })
                    console.log(this.form)
                    this.$emit('submit',this.form)
                    _this.$axios.post('/api/registerform',this.form).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            // _this.$alert("注册成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/login')}})
                            // console.log("users提交成功")
                        }
                    })
                }
            });
        },
        getCode(){
            this.$axios.post('/api/sendCode',{stuMail:this.form.stuMail}).then((resp) => {
                console.log(resp.data)
            })
        }
    }
};
</script>

<style scoped>
html,body,#app{
    height: 100%;
    margin: 0px;
    padding: 0px;
}
.box{
    text-align: center;
    margin: auto;

}
#logo_crms {
    width: 100px;
    height: 100px;
    margin: auto;
}
.box1{
    width: 350px;
    margin: auto;
    border: #BCBCBC 1px solid;
    border-radius: 10px;
    padding-bottom: 20px;
    padding-left: 15px;
    padding-right: 15px;
    background-color: #F6F8FA;

}
.quanxian{
    font-size: 13px;
    text-align: left;
}
.quanxian > p{
    text-align: left;
    margin-bottom: 10px;
}
.input_acount{
    font-size: 13px;

}
.input_acount > p{
    text-align: left;
    margin-bottom: 10px;
}
.input_pwd{
    font-size: 13px;
}
.input_pwd > p{
    text-align: left;
    margin-bottom: 10px;
}
.input_email{
    font-size: 13px;
}
.input_email > p{
    text-align: left;
    margin-bottom: 10px;
}
.verification_code{
    font-size: 13px;
    display: flex;
    flex-direction: row;
}
.verification_code > .ver_code_one {
    flex: 2;
    text-align: left;
    margin-bottom: 10px;
}
.verification_code > .ver_code_two{
    flex: 1;
    text-align: right;
}
.ver_code_two > button{
    margin-top: 43px;
    /*text-align: right;*/
}
.footer{
    font-size: 13px;
    display: flex;
    flex-direction: row;
    /*border: 1px black solid;*/
    padding-top: 10px;
}
.footer > p{
    flex: 1;
    /*text-align: left;*/
    /*margin-top: 10px;*/
    /*border: 1px black solid;*/
    margin-bottom: 0px;
}
.footer > a{
    flex: 1;
    margin-top: 13px;
    /*border: 1px black solid;*/
}
</style>