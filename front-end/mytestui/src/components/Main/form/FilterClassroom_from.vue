<template>
    <div class="box">
        <h3>选择所需教室的配置信息</h3>
        <div class="box1">
            <el-form :model="form" ref="form">
                <div class="day">
                    <p>日期：</p>
                    <el-form-item prop="applyDay" :rules="[
                        {required: true, message:'日期不能为空', trigger:'blur'},
                        {type: 'date', message: '请输入正确的日期格式',trigger:'blur'}
                    ]">
                        <el-date-picker v-model="form.applyDay" type="date" placeholder="Pick a day" value-format="YYYY-MM-DD" style="margin-top: 10px; width: 300px"/>
<!--                        <el-input v-model="form.day" placeholder="month/day" style="width: 300px">mouth/day</el-input>-->
                    </el-form-item>
                </div>
                <div class="time">
                    <p>时间：</p>
                    <el-form-item prop="applyTime" :rules="[
                        {required: true, message:'时间不能为空', trigger: ['blur','change']}
                    ]">
                            <el-checkbox-group v-model="form.applyTime" style="width: 350px;">
                                <el-checkbox label="第一大节" name="1" />
                                <el-checkbox label="第二大节" name="2" />
                                <el-checkbox label="第三大节" name="3" />
                                <el-checkbox label="第四大节" name="4" />
                                <el-checkbox label="第五大节" name="5" />
                                <el-checkbox label="第六大节" name="6" />
                            </el-checkbox-group>
                    </el-form-item>
                </div>
                <div class="people_num">
                    <p>人数：</p>
                    <el-form-item prop="peopleNum" :rules="[
                        {required: true, message:'人数不能为空',trigger:'blur'},
                        {type:'number',message:'输入必须为数字', trigger:'blur'}
                    ] ">
        <!--            <el-input-number v-model="number" :min="1" :max="100" step="1"></el-input-number>-->
                        <el-slider v-model="form.peopleNum" style="width: 450px" ref="slider" :min="min" :max="max" :step="step" :show-input="true" :show-stops="true" @change="sliderchange" ></el-slider>
        <!--            <span>{{value}}</span>-->
                    </el-form-item>
                </div>
                <div class="Multimedia_configuration">
                <p>多媒体配置：</p>
                    <el-form-item prop="type" :rules="[
                        {required: true,message:'选择正确的多媒体配置', trigger:'blur'}
                    ]">
                        <el-select v-model="form.type"  class="m-2" placeholder="无要求" style="width: 300px">
                            <el-option label="电脑Windows7、电子白板、麦克风" value="1"></el-option>
                            <el-option label="电脑Windows10、电子白板+双屏显示、麦克风" value="2"></el-option>
                            <el-option label="电脑Windows7、无白板" value="3"></el-option>
                            <el-option label="无要求" value="4"></el-option>
                        </el-select>
                    </el-form-item>
                </div>
                <div class="position">
                    <p>位置：</p>
                    <div class="position_next">
                        <el-form-item prop="positionOne" :rules="[
                            {required: true,message: '请选择正确的位置', trigger:'blur'}
                        ]">
                            <el-select v-model="form.positionOne" class="m-2" placeholder="选择校区" style="padding-bottom: 10px; width: 300px">
                                <el-option label="新校区" value="1"/>
                                <el-option label="老校区" value="2"/>
                                <el-option label="无要求" value="3"/>
                            </el-select>
                        </el-form-item>

                        <el-form-item prop="positionTwo" :rules="[
                            {requried: true, message:'请选择正确的位置', trigger:'blur'}
                        ]">
                            <el-select v-model="form.positionTwo" class="m-2" placeholder="选择教学楼" style="width: 300px ;padding-bottom: 20px">
                                <el-option label="A4" value="1"/>
                                <el-option label="A5" value="2"/>
                                <el-option label="A6" value="3"/>
                                <el-option label="A7" value="4"/>
                                <el-option label="A3" value="5"/>
                                <el-option label="A2" value="6"/>
                                <el-option label="无要求" value="7"/>
                            </el-select>
                        </el-form-item>

                    </div>
                </div>
                <div class="submit">
                    <el-button type="primary" @click="onsubmit" style="width: 300px">submit</el-button>
                </div>
            </el-form>
        </div>
    </div>

</template>

<script>
// import {ElCheckboxGroup} from "element-plus";
// import {ElCheckbox} from "element-plus";

// import {ref} from 'vue'
// const num = ref(1)
// const handleChange = (value:number) => {
//     console.log(value)
// }
// import axios from "axios";

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: 'filterclassroom',
    components:{
        // ElCheckbox,
        // ElCheckboxGroup,
    },
    // data(){
    //     return{
    //         number: 1
    //     }
    // }
    props:{
        min:{
            type:Number,
            default: 0,
            required: true,
        },
        max:{
            type:Number,
            default: 100,
            required: true,
        },
        step:{
            type:Number,
            default: 1,
        },
        value:{
            type:Number,
            default:0,
        },
        value_option:{
            type:Array,
            default:() => []
        },
        options:{
            type:Array,
            default: () => [],
        },
        value_checkbox:{
            type:Array,
            default: () => [1, 2 ,3],
        }
    },
    methods:{
        sliderchange(val){
            this.$emit("update:value",val)
        },
        checkboxChange(val){
            this.$emit("update:value", val)
        },
        onsubmit(){
            let _this = this
            this.$refs.form.validate((valid) => {
                if (valid){
                    this.form.applyTime = JSON.stringify(this.form.applyTime);
                    this.form.applyDay = JSON.stringify(this.form.applyDay)
                    console.log(this.form.applyTime)
                    console.log(this.form.applyDay)
                    this.$axios.post('/api/filterclassroom?applyDay='+encodeURIComponent(this.form.applyDay)+'&applyTime='+encodeURIComponent(this.form.applyTime)).then(function (resp){
                        if (resp.data){
                            // eslint-disable-next-line no-unused-vars
                            // _this.$alert("数据提交成功",'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/index')}})
                            const filteredData = resp.data.data.map(({position}) => position);
                            // eslint-disable-next-line no-unused-vars
                            _this.$alert("符合要求的教室有:"+JSON.stringify(filteredData),'',{confirmButtonText:'确定',callback: action =>{_this.$router.push('/index')}})
                        }
                    })
                    console.log(this.form)
                    this.$emit('submit',this.form)
                }
            });
        }
    },
    data(){
        return{
            // selectedCheckbox:this.value_checkbox,
            // selectedOptions:this.value_option,
            form:{
                applyDay:'',
                applyTime:[],
                peopleNum:'',
                type:0,
                positionOne:'',
                positionTwo:''
            }
        }
    },


}
</script>

<style scoped>
.box{
    /*border: 1px black solid;*/
    /*margin: 20px;*/
    padding-bottom: 20px;
    padding-left: 20px;
    padding-right: 20px;
    border-radius: 20px;
    background-color: #F6F8FA;
    border: #BCBCBC 1px solid;
    text-align: center;
}
.box1{
    width: 600px;
    margin: auto;
    /*border: 1px black solid;*/
}
.day{
    display: flex;
    flex-direction: row;
}
.day > p{
    width: 150px;
    text-align: right;
}
.time{
    display: flex;
    flex-direction: row;
}
.time > p{
    width: 150px;
    text-align: right;
    padding-right: 20px;
}
.people_num{
    display: flex;
    flex-direction: row;
}
.people_num > p{
    width: 150px;
    text-align: right;
    padding-right: 20px;
}
.Multimedia_configuration{
    display: flex;
    flex-direction: row;
}
.Multimedia_configuration > p{
    width: 150px;
    text-align: right;
    /*padding-right: 20px*/
}
.position{
    display: flex;
    flex-direction: row;
}
.position > p{
    width: 150px;
    text-align: right;
    /*padding-right: 20px;*/
}
.position_next{
    display: flex;
    flex-direction: column;
}
.submit{
    /*border: 1px black solid;*/
}
.el-button{
    position: relative;
    /*width: 100px;*/
    /*right: 110px;*/
}
</style>