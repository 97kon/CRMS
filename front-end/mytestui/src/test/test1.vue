<template>
    <el-checkbox-group :value="checkedValues" @change="updateCheckedValues">
        <el-checkbox :value="'Option A'">Option A</el-checkbox>
        <el-checkbox :value="'Option B'">Option B</el-checkbox>
        <el-checkbox :value="'Option C'">Option C</el-checkbox>
        <el-checkbox :value="'disabled'" disabled>disabled</el-checkbox>
        <el-checkbox :value="'selected and disabled'" disabled>selected and disabled</el-checkbox>
    </el-checkbox-group>
    <div>{{store.count}}</div>
</template>

<script>
import { reactive } from 'vue';
import { ElCheckboxGroup, ElCheckbox } from 'element-plus';
import {store} from "@/store/store";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: 'test1',
    data(){
        return{
            store
        }
    },
    components: { ElCheckboxGroup, ElCheckbox },
    setup() {
        const checkedValues = reactive(['selected and disabled', 'Option A']);
        const updateCheckedValues = (values) => {
            checkedValues.value = values;
        };
        return { checkedValues, updateCheckedValues };
    },
};
</script>

<style scoped>

</style>