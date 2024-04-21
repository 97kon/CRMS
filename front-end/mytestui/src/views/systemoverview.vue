<template>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <div class="common-layout">
        <el-container>
            <el-header>
                <el-row :gutter="20" style="padding-top: 0px">
                    <el-col :span="3" >
                        <!--                        <div class="grid-content ep-bg-purple" />-->
                        <!--                        <img id="logo" src="../assets/logo(CRMS).png">-->
                        <!--                        <p>CRMS</p>-->
                        <img src="../assets/logo.png" class="logo" alt="管理系统">
                    </el-col>
                    <el-col :span="17" class="col1">
                        <!--                        <div class="grid-content ep-bg-purple" />-->
                        <!--                        elementplus提供的导航栏-->
                        <!--                        <el-breadcrumb separator="/" class="custom-separator">-->
                        <!--                            <el-breadcrumb-item :to="{path:'/index'}">首页</el-breadcrumb-item>-->
                        <!--                            <el-breadcrumb-item :to="{path:'/index'}">系统概述</el-breadcrumb-item>-->
                        <!--                            <el-breadcrumb-item :to="{path:'/index'}">系统功能</el-breadcrumb-item>-->
                        <!--                            <el-breadcrumb-item :to="{path:'/index'}">申请查询</el-breadcrumb-item>-->
                        <!--                        </el-breadcrumb>-->
                        <div class="nav_box">
                            <div class="nav_1"><router-link to="/index"><p style="color: white">首页</p></router-link></div>
                            <div class="nav_2" style="color: #33CC99"><p>系统概述</p></div>
                            <div class="nav_3"><router-link to="/systemfunction"><p style="color: white">系统功能</p></router-link></div>
                            <div class="nav_4" v-if="store.type === '1' || store.type === '4'"><router-link to="/applicationinquiry"><p style="color: white">个人申请</p></router-link></div>
                        </div>
                    </el-col>
                    <el-col :span="4">
                        <!--                        <div class="grid-content ep-bg-purple" />-->
                        <el-dropdown>
                              <span class="el-dropdown-link">
<!--                                  <i class="material-icons">perm_identity</i>-->
                                  <p>admin</p>
                                  <!--                                  <i class="material-icons">account_box</i>游客-->
                                  <!--                                  <el-icon name="el-icon-goods"></el-icon>游客-->
                                  <!--                                  <el-icon><User /></el-icon>游客-->
                                  <!--                                <el-icon><UserFilled /></el-icon>游客-->
                                  <i class="material-icons">keyboard_arrow_down</i>
                                  <!--                                  <i class="el-icon-d-arrow-left">-->

                                <el-icon class="el-icon--right">
                                  <arrow-down />
                                </el-icon>
                                  <!--                                  <i class="material-icons">keyboard_arrow_down</i>-->
                              </span>
                            <template #dropdown>
                                <el-dropdown-menu>
                                    <el-dropdown-item><router-link to="/user">个人资料</router-link></el-dropdown-item>
                                    <el-dropdown-item>账号管理</el-dropdown-item>
                                    <el-dropdown-item>设置</el-dropdown-item>
                                    <el-dropdown-item divided>退出系统</el-dropdown-item>
                                </el-dropdown-menu>
                            </template>
                        </el-dropdown>
                    </el-col>
                </el-row>
            </el-header>
            <el-container class="box_down">
                <el-aside width="200px" style="background-color: #545C64">
                    <el-menu :default-active="$route.path"
                             class="el-menu-vertical-demo"
                             active-text-color="#33CC99"
                             background-color="#545C64"
                             text-color="#fff"
                             @open="handleOpen"
                             @close="handleClose"
                             accordion>
                        <el-submenu index="1">
                            <template #title>
                                <i class="el-icon-location"></i>
                                <span>使用说明</span>
                            </template>
                            <el-menu-item index="1-1">制作课表说明</el-menu-item>
                            <el-menu-item index="1-2">找教室说明</el-menu-item>
                            <!--                            <el-menu-item index="1-3">选项3</el-menu-item>-->
                        </el-submenu>
<!--                        <el-submenu index="2">-->
<!--                            <template #title>-->
<!--                                <i class="el-icon-menu"></i>-->
<!--                                <span>找教室</span>-->
<!--                            </template>-->
<!--                            <el-menu-item index="2-1">筛选教室</el-menu-item>-->
<!--                            <el-menu-item index="2-2">申请表单</el-menu-item>-->
<!--                            <el-menu-item index="2-3">审核表单</el-menu-item>-->
<!--                            <el-menu-item index="2-3">验证申请</el-menu-item>-->
<!--                        </el-submenu>-->
                        <!--                        <el-submenu index="3">-->
                        <!--                            <template #title>-->
                        <!--                                <i class="el-icon-setting"></i>-->
                        <!--                                <span>导航三</span>-->
                        <!--                            </template>-->
                        <!--                            <el-menu-item index="3-1">选项1</el-menu-item>-->
                        <!--                            <el-menu-item index="3-2">选项2</el-menu-item>-->
                        <!--                            <el-menu-item index="3-3">选项3</el-menu-item>-->
                        <!--                        </el-submenu>-->
                    </el-menu>
                </el-aside>
                <el-container>
                    <el-main style="border: 1px #333333 solid">Main</el-main>
                    <el-footer style="border: 1px black solid">Footer</el-footer>
                </el-container>
            </el-container>
        </el-container>
    </div>

</template>

<script>
import {ElIcon, ElMain} from "element-plus";
// import {mapGetters} from "vuex";
import {store} from "@/store/store";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "systemoverview",
    data(){
        return{
            store
        }
    },
    components: {ElMain, ElIcon},
    computed:{
        // ...mapGetters(["userType"])
    }
}
</script>

<style scoped>

.el-breadcrumb-item{
    border-left: 1px black solid;
    background-color: #F6F8FA;
}
.nav_box{
    /*background-color: gray;*/
    display: flex;
    flex-direction: row;
    /*border: 1px black solid;*/
    width: 400px;
    text-align: center;
    height: 58px;
}
.nav_box > div{
    flex: 1;
}
.nav_box > div:hover{
    background-color: #434A50;
}
/*.logo_father{*/
/*    position: relative;*/
/*    !*padding-bottom: 0px;*!*/
/*    !*line-height: 55px;*!*/
/*    height: 60px;*/
/*}*/
/*#logo{*/
/*    position: absolute;*/
/*    width: 100%;*/
/*    height: 100%;*/
/*    object-fit: cover;*/
/*}*/
.logo{
    width: 45px;
    height: 45px;
    /*margin: auto;*/
    /*margin-left: 30%;*/
}
.el-row {
    align-items: center;
    vertical-align: middle;
    padding-top: 10px;
}
.el-header {
    background-color: #545c64;
}
.col1{
    color: #F6F8FA;
}
.userinfo {
    text-align: right;
}

.el-dropdown-link {
    color: white;
    /*text-align: center;*/
    display: flex;
    flex-direction: row;
}
.el-dropdown-link > i{
    flex: 1;
}
.el-dropdown-link > p{
    flex: 1;
    margin-top: 5px;
}
.box_down{
    /*line-height: 100%;*/
    height: 650px;
}
.el-menu-vertical-demo {
    width: 100%;
    border-radius: 0;
}
/*.el-breadcrumb-item{*/
/*    width: 50px;*/
/*}*/

</style>