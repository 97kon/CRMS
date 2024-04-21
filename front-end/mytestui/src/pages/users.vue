<template>
    <link rel="stylesheet" href="../pages/bootstrap.min.css">
<!--    <link href="https://fonts.googleapis.com/icon?family=Material+Icons">-->
<!--    <link rel="stylesheet" href="../pages/users.css">-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <div class="box1" id="box">
        <span class="musicimg"><img src="../assets/images/music.png" style="width: 40px; height: 40px;"></span>
        <div class="daohang">
            <nav class="navbar navbar-expand-md bg-light navbar-light" style="background-color: white; ">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="img" style="font-size: 20px;">
            <img src="../assets/images/flower1mini1.jpg" style="width: 28%; height: 21%;">
            <img src="../assets/images/flower1mini2.jpg" style="width: 28%; height: 21%;">
            "marco & star"
        </div>
        <div class="bg"></div>
        <div class="musicplay">
            <div class="music">
                <h2 class="title">Music Name</h2>
                <div class="player">
                    <audio src=""></audio>
                    <div class="btns">
                        <div class="prev"><span class="material-icons">skip_previous</span>
                        </div>
                        <div class="playPause" ><span class="material-icons">play_circle_outline</span>
                        </div>
                        <div class="next"><span class="material-icons">skip_next</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</template>

<script type="text/javascript">

window.onload =function(){
    var box = document.getElementById('box');
    var timer = null;
    var num = box.offsetWidth;
    // 打印盒子右边距宽度
    console.log(num);

    box.onmouseover = function(){
        //先关闭定时器
        clearInterval(timer);
        timer = setInterval(function(){
            if(box.offsetLeft <= 0 && box.offsetLeft > -5){

                clearInterval(timer);
                return;
            }
            box.style.left = box.offsetLeft + 5 +'px';
        },1)
    }
    box.onmouseout = function(){
        //先关闭定时器
        clearInterval(timer);
        timer = setInterval(function(){
            if(box.offsetLeft < -num){
                console.log(num);
                clearInterval(timer);
                return;
            }
            box.style.left = box.offsetLeft + -5 +'px';

        },1)
    }
}

const title= document.querySelector('.title');
const prev= document.querySelector('.prev');
const playPause= document.querySelector('.playPause');
const next= document.querySelector('.next');
const audio= document.querySelector('audio');

// song list
const songList =[
    {
        path:"file:///E:/HBuilderX/mytestui/src/assets/music/曾雪雅 - 一半甜.mp3",
        songName:"一半甜",
    },
    {
        path:"file:///E:/HBuilderX/mytestui/src/assets/music/Madnap _ Pauline Herr - Slow Down.mp3",
        songName:"Slow Down",
    },
    {
        path:"file:///E:/HBuilderX/mytestui/src/assets/music/Ivoris - I Wish My Mind Would Shut Up.mp3",
        songName:"I Wish My Mind Would Shut Up",
    },
    {
        path:"file:///E:/HBuilderX/mytestui/src/assets/music/周杰伦 - 反方向的钟.mp3",
        songName:"反方向的钟",
    },
];

let songPlaying = false;

//play song
const playSong = ()=>{
    songPlaying = true;
    audio.play();
    playPause.classList.add('active');
    playPause.innerHTML = '<span class="material-icons">pause_circle_outline</span>';
}

//pause song
const pauseSong = () => {
    songPlaying = false;
    audio.pause();
    playPause.classList.remove('active');
    playPause.innerHTML = ' <span class="material-icons">play_circle_outline</span>';

}
//play/pause song
playPause.addEventListener("click",() => (songPlaying? pauseSong() : playSong()));

//load song
const loadSong = (songList) => {
    title.textContent = songList.songName;
    audio.src = songList.path;//

}
let i = 0;
loadSong (songList[i]);

//previous song
const prevSong = () => {
    i--;
    if (i < 0){
        i = songList.length -1;
    }
    loadSong(songList[i]);
    playSong();
}

prev.addEventListener("click", prevSong);

//next song
const nextSong = () => {
    i++;
    if (i > (songList.length - 1)){
        i = 0;
    }
    loadSong(songList[i]);
    playSong();
}

next.addEventListener("click", nextSong);

export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "users"
}
</script>
<!--<script src="../pages/users.js"></script>-->

<style scoped>
*{
    padding: 0;
    margin: 0;
}
body{
    /* background-color: aqua;*/
    background-image: url(../assets/images/爱上紫禁城-海棠.jpg);
}
.box1{
    background-color: white;
    width: 50%;
    height: 100vh;
    position: relative;
    left: -50%;
    /* background: linear-gradient(to right bottom,rgba(255,255,255,1),rgba(255,255,255,0.5)); */
    /* backdrop-filter: blur(2rem); */
    /* border-radius:0em 2em 2em 0em; */
}
.musicimg{
    position: absolute;
    width: 60px;
    height: 60px;
    background-color: darkred;
    color: black;
    right: -40px;
    top: 50%;
    margin-top: -30px;
    line-height: 60px;
    text-align: center;
    border-radius: 1em;
}
.img img{
    margin-right: 50px;
    margin-top: 70px;
}
.bg{
    position: absolute;
    /* background-color: aqua;*/
    background-image: url(../assets/images/flower1mini2.jpg) ;
    width: 60%;
    height: 20%;
    bottom: 0%;
    border-radius: 0em 2em 0em 0em;
}
.musicplay{
    position: absolute;
    width: 60%;
    height: 20%;
    bottom: 0%;
    background: linear-gradient(to right bottom,rgba(255,255,255,0),rgba(255,255,255,0.1));
    backdrop-filter: blur(0.3rem);
    border-radius: 0em 2em 0em 0em;
}
.music{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}
.title{
    font-weight: 25;
    text-align: center;
    font-size: 1.5625rem;
    color: white;
    margin-top: 1.875rem;
}
.player{
    position: relative;
}
.btns {
    /* position: relative; */
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    /* background: red; */

}

.btns div{
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
}
.btns div:active,
.btns div.active
{
    color:darkred;
}
.btns .playPause {
    height: 100px;
    width: 100px;
}
.btns .material-icons {
    font-size: 2em;
    color: white;
}
.btns .playPause span {
    font-size: 3em;
    /* color: darkred; */
}
.material-icons:hover{
    color: darkred;
}

</style>