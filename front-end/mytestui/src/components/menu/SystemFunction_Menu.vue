<template>
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
                <span>制作课表</span>
            </template>
            <el-menu-item index="1-1">输入</el-menu-item>
            <el-menu-item index="1-2">输出</el-menu-item>
            <!--                            <el-menu-item index="1-3">选项3</el-menu-item>-->
        </el-submenu>
        <el-submenu index="2">
            <template #title>
                <i class="el-icon-menu"></i>
                <span>找教室</span>
            </template>
            <el-menu-item index="2-1">筛选教室</el-menu-item>
            <el-menu-item index="2-2">申请表单</el-menu-item>
            <el-menu-item index="2-3">审核表单</el-menu-item>
            <el-menu-item index="2-3">验证申请</el-menu-item>
        </el-submenu>
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

</template>

<script>
export default {
    name: "SystemFunction_Menu"
}
</script>

<style scoped>

</style>