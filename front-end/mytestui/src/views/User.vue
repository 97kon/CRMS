<template>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--    <h1>当前页面为用户个人信息显示页面</h1>-->
    <div class="box">
        <div class="left_bg">
            <img src="../assets/UserBgLeft.jpg" style="width: 100%;height: 100%;z-index: 1" alt="">
            <div class="button_bg">
                <div class="touxiang"><img src="../assets/UserHead.jpg" style="width:80px;border-radius: 50px;border: 3px white solid" alt=""></div>
                <div class="content"><p style="font-size: 25px">{{StuName}}</p><p>{{StuID}}</p></div>
            </div>
        </div>
        <div class="right_bg">
            <div class="right_content">
            <div class="username" style="display: flex;flex-direction: row">
                <i class="material-icons">account_circle</i>
                <p>账号/学号:   {{username}}</p>
            </div>
            <div class="pwd" style="display: flex;flex-direction: row">
                <i class="material-icons">vpn_key</i>
                <p>密码:   {{pwd}}</p>
            </div>
            <div class="phone_num" style="display: flex;flex-direction: row">
                <i class="material-icons">contact_phone</i>
                <p>手机号:   {{phonenum}}</p>
            </div>
            <div class="mail" style="display: flex;flex-direction: row">
                <i class="material-icons">contact_mail</i>
                <p>邮箱号:   {{mail}}</p>
            </div>
            <div class="user_type" style="display: flex;flex-direction: row">
                <i class="material-icons">clear_all</i>
                <P>账号类别:   {{UserType}}</P>
            </div>
                <div class="line">

                </div>
                <div class="button_group">
                <el-button type="info" plain style="margin: 10px">编辑资料</el-button>
                <el-button type="info" plain style="margin: 10px">修改密码</el-button>
                <el-button type="info" plain style="margin: 10px">向客服留言</el-button>
                </div>
            </div>

        </div>
    </div>
</template>

<script>
export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "User",
    data(){
        return{
            StuName:"小铭不会C语言#",
            StuID:21067010122,
            username:21067010122,
            pwd:"Lqm1314520",
            phonenum:13980194399,
            mail:"3231045496@qq.com",
            UserType:"普通用户",
        }
    },
    methods:{

    }
}
</script>

<style scoped>
.box{
    /*border: 1px black solid;*/
    margin: 20px;
    /*padding-bottom: 20px;*/
    /*padding-left: 20px;*/
    /*padding-right: 20px;*/
    /*border-radius: 20px;*/
    /*background-color: #F6F8FA;*/
    border: #BCBCBC 1px solid;
    /*text-align: center;*/
    display: flex;
    flex-direction: row;
    width: 800px;
    height: 500px;
}
.left_bg{
    flex: 1;
    /*border: 1px black solid;*/
    /*position: absolute;*/
    position: relative;
}
.button_bg{
    height: 150px;
    background-color: rgba(255,255,255,0.7);
    /*position: relative;*/
    position: relative;
    top:-150px;
    /*right: 20px;*/
    display: flex;
}
.touxiang{
    flex: 2;
    text-align: center;
    padding-top: 30px;
}
.content{
    flex: 5;
    padding-top: 5px;
    padding-left: 20px;
    /*padding-right: 20px;*/
    color: white;
}
.right_bg{
    flex: 1;
    /*border: 1px black solid;*/
    /*border-bottom:1px black solid;*/
    /*!*border-left:; ;*!*/
    /*border-top: 1px black solid;*/
    /*border-right: 1px black solid;*/
}
.right_content{
    /*padding-top: 20px;*/
    /*padding-left: 20px;*/
    margin-left: 30px;
    margin-right: 30px;
    margin-top: 5px;
    /*border: 1px black solid;*/
    font-size: 18px;
    height: 450px;
}
.line{
    /*width: 300px;*/
    margin-top: 10px;
    margin-bottom: 20px;
    border-bottom: 1px solid black;
}
.button_group{
    display: flex;
    flex-direction: column;

}
i{
    margin: 18px;
}
</style>