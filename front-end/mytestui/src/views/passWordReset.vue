<template>
    <div class="box">
        <img id="logo_crms" src="@/assets/logo(CRMS).png">
        <h2>重置密码</h2>
<!--        <el-form>-->
        <el-form :model="form" ref="form">
            <div class="box1">
<!--                <el-form :model="form" ref="form">-->
<!--                <pass-word-reset :user-identifier="identifier" form-title="Reset Password" @submit="handlePasswordReset">-->
<!--                </Passwordreset>-->

                      <div class="input_mail">
                        <p>输入您用户账户的已验证电子邮件地址，我们将向你发送密码重置验证码:</p>
                          <el-form-item prop="stuMail" :rules="[
                        {required: true, message:'邮箱不能为空',trigger:['blur', 'change']},
                        {type:'email',message: '请输入正确的邮箱地址',trigger:['blur', 'change']}
                    ]">
                        <el-input placeholder="输入您的电子邮箱地址" v-model="form.stuMail" ></el-input>
                          </el-form-item>
                    </div>

                      <div class="password_one">
                          <p>密码:</p>
                          <el-form-item prop="pwd" :rules="[
                        {required: true,message:'密码不能为空',trigger:['blur', 'change']}
                    ]">
                          <el-input placeholder="请输入您的新密码" v-model="form.pwd" ></el-input>
                          </el-form-item>
                      </div>

                      <div class="password_two">
                          <p>确认密码:</p>
                          <el-form-item prop="pwd1" :rules="[
                        {required: true, message:'确认密码不能为空',trigger:['blur', 'change']}
                    ]">
                          <el-input placeholder="请确认您的新密码" v-model="form.pwd1" ></el-input>
                          </el-form-item>
                      </div>

                      <div class="verification_code">
                            <div class="ver_code_one">
                                <p>验证您的账户：</p>
                                <el-form-item prop="verCode" :rules="[
                              {required: true, message:'验证码不能为空',trigger:['blur', 'change']}
                          ]">
                                <el-input placeholder="输入您获取到的邮件验证码" v-model="form.verCode"></el-input>
                                </el-form-item>
                            </div>
                          <div class="ver_code_two">
                              <el-button type="primary" plain @click="sendCode">get code</el-button>
                          </div>
                      </div>
                      <div class="submit">
                          <el-button type="primary" style="width: 450px" @click="onsubmit()">确认重置密码</el-button>
                      </div>
<!--                </el-form>-->
            </div>
        </el-form>
<!--        </el-form>-->
        <div class="footer">
            <a href="">Terms</a>
            <a href="">Privacy</a>
            <a href="">Security</a>
            <p>Contact CRMS</p>
        </div>
    </div>
</template>

<script>
import axios from "axios";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "passwordreset",
    data(){
        return {
            identifier:'',
            form:{
                stuMail:'',
                pwd:'',
                pwd1:'',
                verCode:''
            }
        }
    },
    methods:{
        onsubmit(){
            let _this = this
            this.$refs.form.validate(valid => {
                if (valid){
                    if (this.form.pwd !== this.form.pwd1){
                        this.$message({
                            message:"两次输入的密码不一致",
                            type:'warning'
                        });
                        return
                    }
                    const data = {
                        stuMail: this.form.stuMail,
                        pwd: this.form.pwd,
                        verCode: this.form.verCode
                    }
                    console.log(data)
                    axios.post('/api/passwordreset?stuMail='+this.form.stuMail+'&pwd='+this.form.pwd+'&verCode='+this.form.verCode).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            _this.$alert("修改成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/login')}})
                        }
                    })
                    console.log(this.form)
                    this.$emit('submit',this.form)
                }
            })

        },
        sendCode(){
            this.$axios.post('/api/sendCode',{stuMail:this.form.stuMail}).then((resp) => {
                console.log(resp.data)
            })
        }
    }
}
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
#logo_crms{
    width: 100px;
    height: 100px;
    margin: auto;
}
.box1{
    width: 450px;
    margin: auto;
    border: #BCBCBC 1px solid;
    border-radius: 10px;
    padding-bottom: 20px;
    padding-left: 15px;
    padding-right: 15px;
    background-color: #F6F8FA;

}
.footer{
    width: 500px;
    border-radius: 20px;
    padding-bottom: 20px;
    padding-left: 15px;
    padding-right: 15px;
    margin: 20px auto auto;
    display: flex;
    flex-direction: row;
    font-size: 5px;
}
.footer > p{
    padding-top: 12px;
    margin-right: 0px;
    flex: 2;
}
.footer > a{
    flex: 1;

    line-height: 50px;
}
.verification_code{
    font-size: 13px;
    display: flex;
    flex-direction: row;
}
.verification_code > .ver_code_one {
    flex: 3;
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
.input_mail{
    /*height: 50px;*/
    font-size: 13px;
    position: relative;
    /*border: #333333 1px solid;*/
}
.input_mail > p{
    /*border: #333333 1px solid;*/
    margin-bottom: 10px;
    text-align: left;
}
.password_one{
    font-size: 13px;
    position: relative;
}
.password_one > p{
    /*border: #333333 1px solid;*/
    margin-bottom: 10px;
    text-align: left;
}
.password_two{
    font-size: 13px;
    position: relative;
}
.password_two > p{
    /*border: #333333 1px solid;*/
    margin-bottom: 10px;
    text-align: left;
}
</style>