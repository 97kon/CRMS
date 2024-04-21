<template>
<!--    <h1>test4</h1>-->
    <el-table :data="tableData" :border="parentBorder" style="width: 100%">
        <el-table-column type="expand">
            <template #default="props">
                <div m="4">
                    <p m="t-0 b-2">State: {{props.row.state }}</p>
                    <p m="t-0 b-2">City: {{ props.row.city }}</p>
                    <p m="t-0 b-2">Address: {{ props.row.address }}</p>
                    <p m="t-0 b-2">Zip: {{ props.row.zip }}</p>
                </div>

            </template>
        </el-table-column>
        <el-table-column label="Date" prop="date" />
        <el-table-column label="Name" prop="name" />
    </el-table>
</template>

<script>
export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "test4",
    data(){
        return{
            tableData:[
                {
                    date:'2016',
                    name:'lqm',
                    state:'6',
                    city:'东软',
                    address:'dongruanD3',
                    zip:'false'
                }
            ]
        }
    }
}
</script>

<style scoped>

</style>