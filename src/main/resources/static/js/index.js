const loginInput = document.getElementById("loginInput");
const loginPassword = document.getElementById("loginPassword");
const loginSubmit = document.getElementById("loginSubmit");
const addButton = document.getElementById("addButton");
const SearchEquID = document.getElementById("SearchEquID");


//Login
loginSubmit.onclick = async function (){
    try{
        const response = await fetch("http://localhost:5050/api/manager");
        const data = await response.json();
        if (loginInput.value == data.username && loginPassword.value == data.password){
            window.alert("Logged in successfully!");
            window.location.replace('index.html');
        }
        else{
            window.alert("Invalid Credentials\nTry again!!");
        }
    }
    catch(error){
        console.error(error);
    }
    
}

//remove Equipment
/*addButton.addEventListener('submit', async function(event) {
     event.preventDefault(); // Prevent the form from submitting the default way 
     const equID = SearchEquID.value; 
     const data = { 
        equID: equID 
    }; 
    try {
         const response = await fetch('http://localhost:5050/api/equipments', {
         method: 'POST', 
         headers: {
             'Content-Type': 'application/json', 
            }, body: JSON.stringify(data) 
        }); 
        const result = await response.json(); 
        console.log(result); 
    } catch (error) {
         console.error('Error:',error); 
        } 
    });*/

    /*addButton.onclick = async function (){
        try{
            const response = await fetch('http://localhost:5050/api/equipment');
            if (!response.ok) {
                 throw new Error('Network response was not ok ' + response.statusText); 
                }
            const data = await response.json();
            if (SearchEquID.value == data.equID){
                const h3 = document.createElement("h3");
               // h3.textContent = data; display the full info of the equipment and delete it, then inform
            }
            else{
                window.alert(`Equipment with the ID ${SearchEquID.value} doesn't exist!`);
            }
        }
        catch(error){
            console.error(error);
        }
        
    }*/