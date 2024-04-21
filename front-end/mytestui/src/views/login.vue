<template>
    <div class="box">
<!--        <span id="logo"></span>-->
        <img id="logo_crms" src="@/assets/logo(CRMS).png">
        <h2>Sign in to CRMS</h2>
        <el-form :model="form" ref="form">
          <div class="box1">
            <div class="UserName">
            <p>Username or email address</p>
            </div>
              <el-form-item prop="username" :rules="[
                  {required: true, message:'账号不能为空', trigger: 'blur'}
              ]">
                  <el-input v-model="form.username"></el-input>
              </el-form-item>
            <div class="pwd">
                <p>Password</p>
                <router-link to="/passwordreset"><a>Forgot password?</a></router-link>
            </div>
              <el-form-item prop="pwd" :rules="[
                  {required: true, message: '密码不能为空', trigger:'blur'}
              ]">
                <el-input v-model="form.pwd"></el-input>
              </el-form-item>
                <el-button type="primary" @click="onsubmit">Sign in</el-button>
        </div>
        </el-form>
        <div class="box2">
            <p>New to CRMS?</p>
            <router-link to="/register"><a href="">Create an account</a></router-link>
        </div>
        <div class="footer">
            <a href="">Terms</a>
            <a href="">Privacy</a>
            <a href="">Security</a>
            <p>Contact CRMS</p>
        </div>
    </div>

</template>

<script>
// import axios from "axios";
// import store from "@/store/store";
import {store} from "@/store/store";
// import store from "@/store/store";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "login",
    data(){
        return{
            typeThis:0,
            store,
            form:{
                username:'',
                pwd:'',
                // type:''
            }
        }
    },
    methods:{
      onsubmit(){
          // typeThis : 0
          let _this = this
          this.$axios.post('/api/gettype?username='+this.form.username).then(res =>{
             // var type = res.data.map(obj => obj.type);
             // console.log(type)
              // _this.$store.commit('setType',type)
              console.log(res.data)
              this.typeThis = res.data[0].type
              // store.dispatch('setUserName',this.form.username)
              // store.dispatch('setType',this.typeThis)
              // console.log(this.typeThis)
              // console.log(this.form.username)
              store.type = this.typeThis
              store.userName = this.form.username
              console.log(store.type)
              console.log(store.userName)
          })


          this.$refs.form.validate((valid) => {
              if (valid){
                  this.$axios.post('/api/login',this.form,{headers:{'Content-Type':'application/x-www-form-urlencoded'},}).then(function (resp){
                      if (resp.data){
                          // store.dispatch('setUserName', this.userName)
                          // store.dispatch('setType', this.type)
                          // 将获取到的type属性保存到vuex中
                          // _this.$store.commit('setType', resp.data.type)
                          // console.log(resp.data.type)
                          // eslint-disable-next-line no-unused-vars
                          _this.$alert("登录成功",'',{callback: action =>{_this.$router.push('/index')}})
                      }else {
                          // eslint-disable-next-line no-unused-vars
                          _this.$alert("登录失败,请重新登录",'',{callback: action =>{_this.$router.push('/login' )}})
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
    width: 300px;
    margin: auto;
    border: #BCBCBC 1px solid;
    border-radius: 10px;
    padding-bottom: 20px;
    padding-left: 15px;
    padding-right: 15px;
    background-color: #F6F8FA;

}
.UserName{
    /*height: 50px;*/
    font-size: 13px;
    position: relative;
    /*border: #333333 1px solid;*/
}
.UserName > p{
    /*border: #333333 1px solid;*/
    margin-bottom: 10px;
    text-align: left;
}
.box2{
    width: 300px;
    border: #BCBCBC 1px solid;
    border-radius: 10px;
    padding-left: 15px;
    padding-right: 15px;
    background-color: #F6F8FA;
    margin: 20px auto auto;
    display: flex;
    flex-direction: row;
    font-size: 15px;
}
.box2 > a{
    flex: 1;
    line-height: 50px;
    padding-top: 5px;
    padding-bottom: 5px;
}
.box2 > p{
    flex: 1;
    padding-top: 5px;
    padding-bottom: 5px;
}
.footer{
    width: 400px;
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
.pwd{
    display: flex;
    flex-direction: row;
    /*border: #333333 1px solid;*/
    font-size: 13px;
    margin-top: 10px;
    position: relative;
}
.pwd > p{
    flex: 1;
    /*border: #333333 1px solid;*/
    text-align: left;
    margin-bottom: 10px;
    /*margin-top: 10px;*/
}
.pwd > a{
    flex: 1;
    /*border: #333333 1px solid;*/
    /*margin-bottom: 0px;*/
    position: absolute;
    bottom: 10px;
    right: 0;
}
.box1 > button{
    /*font-size: 50px;*/
    margin-top: 15px;
    width: 300px;
    /*height: 50px;*/

}
</style>