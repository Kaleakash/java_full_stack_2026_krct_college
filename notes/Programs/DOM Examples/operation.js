function addEmployee() {
    let name = document.getElementById("name").value;
    let age = document.getElementById("age").value;
    let div = document.createElement("div"); // new tag ready 
   // let divTagContent = document.createTextNode("Hello");   // fixed contents 
   let divTagContent = document.createTextNode(name+" "+age);  
    div.appendChild(divTagContent); // content added inside div tag 
    document.getElementsByTagName("body")[0].appendChild(div);

     document.getElementById("name").value=""
     document.getElementById("age").value=""
}