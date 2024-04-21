<template>
    <div>axios</div>
    <el-button type="success" @click="onsubmit">点我</el-button>
</template>

<script>
export default {
    name: "axiosTest",
    data(){
        return{
            name:''
        }
    },
    methods:{
        onsubmit(){
            this.$axios.get("/api/hello").then(res =>{
                console.log(res)
            })
        }
    }
}
</script>

<style scoped>

</style>