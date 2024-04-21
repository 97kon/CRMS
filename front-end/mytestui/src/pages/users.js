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