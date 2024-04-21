<template>
    <div>
        <el-date-picker v-model="date" type="date" placeholder="选择日期" value-format="YYYY-MM-DD"></el-date-picker>
        <el-table :data="filteredData">
            <el-table-column prop="date"></el-table-column>
            <el-table-column prop="name"></el-table-column>
            <el-table-column prop="address"></el-table-column>
        </el-table>
    </div>
</template>

<script>
export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "test5",
    data() {
        return {
            date: '',
            tableData: [
                {
                    date: '2023-06-01',
                    name: '姓名1',
                    address: '地址1'
                },
                {
                    date: '2023-06-02',
                    name: '姓名2',
                    address: '地址2'
                },
                {
                    date: '2023-06-03',
                    name: '姓名3',
                    address: '地址3'
                }
            ]
        }
    },
    computed:{
        filteredData() {
            console.log(this.date)
            if (!this.date) {
                return this.tableData
            }
            return this.tableData.filter(item => item.date === this.date)
        },

    }
}
</script>

<style scoped>

</style>