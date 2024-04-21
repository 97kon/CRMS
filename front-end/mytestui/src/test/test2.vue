<template>
<!--    测试axois的GET请求实现-->
    <div class="box">
        <button @click="getJokes" style="width: 300px;background-color: greenyellow">get</button>
    </div>
</template>

<script>
// import axios from "axios";
import {store} from "@/store/store";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "test2",
    data(){
        return{
            store
        }
    },
    components: {},
    methods: {
        getJokes() {
            // axios
            //     .get("https://autumnfish.cn/api/joke/list?num=6")
            //     .then((res) => {
            //         console.log(res);
            //     })
            //     .catch((err) => {
            //         console.error(err);
            //     });
            // console.log("object");

            store.count = 50
        },
    },
};
</script>

<style scoped>
.box {
    width: 100%;
    height: 100%;
}
</style>
