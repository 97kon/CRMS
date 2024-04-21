<template>
    <h1>当前页面测试axios的post请求实现</h1>
    <div class="box">
        <button @click="getJokes" style="width: 300px;background-color: greenyellow">get</button>
    </div>
</template>

<script>
import axios from "axios";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "test3",
    methods: {
        getJokes() {
            axios
                .post("https://autumnfish.cn/api/user/reg",{
                    username:"张三"
                })
                .then(function (response){
                    console.log(response);
                })
                .catch(function (error){
                    alert(error)
                })
        },
    },
}
</script>

<style scoped>

</style>