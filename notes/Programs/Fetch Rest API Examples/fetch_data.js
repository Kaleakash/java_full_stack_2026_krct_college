async function loadData() {
    try{
        let response = await fetch("https://dummyjson.com/quotes");
        let result = await response.json();
        
        result.quotes.forEach(q=> {
            //console.log(q)
            let list = document.createElement("li");
            let listContents = document.createTextNode("Quote :"+q.quote+" Author : "+q.author)
            list.appendChild(listContents);
            document.getElementById("result").appendChild(list)
        })
    }catch(error){
        console.log(error)
    }finally {

    }
}
loadData();