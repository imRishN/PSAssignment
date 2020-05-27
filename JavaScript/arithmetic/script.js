function result(){
    var choice = getRadioValue();
    var a = parseInt(document.getElementById("n1").value);
    var b = parseInt(document.getElementById("n2").value);
    var result = 0;
   
    if(choice==1){
        result = a+b;
    }else if(choice==2){
        result = a-b;
    }else if(choice==3){
        result = a*b;
    }else{
        result = a/b;
    }   
    document.getElementById("res").innerHTML = result;
}

 function getRadioValue(){
    var radios = document.getElementsByName("choice");
    for( var i = 0; i<radios.length; i++){
        if(radios[i].checked){
            return radios[i].value;
        }
    }
}