
function life(){

    let failed = true;

    if(failed){
        retry();
    } else {
        won();
    }
}

function retry(){
    console.log("retry and again retry 😩");
}

function won(){
    console.log("Finally 🙌❤️");
}

life();