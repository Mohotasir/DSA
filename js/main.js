let input = document.querySelector("input");
let btn = document.querySelector("button");
let ul = document.querySelector("ul");
function handleList(){
   
    let li =  document.createElement("li");
    let butn = document.createElement("button");
    let span  =  document.createElement("span");
    li.appendChild(span);
    li.appendChild(butn);
    span.textContent = input.value;
    butn.textContent = "delete";
    ul.appendChild(li);
    input.value = "";
    function rem(){
        ul.removeChild(li);
    }
    butn.addEventListener("click",rem)
}

btn.addEventListener("click",handleList);
