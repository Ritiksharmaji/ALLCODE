/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

let arrayOfFriends = ['ritik','sharma','amkit','pk'];
let noOfFriends = arrayOfFriends.length;


function getPreferredGameMode(x)
{
   if(x === 0)
   {
       return "Solo"
   }
   else if(x === 1)
   {
       return "Dual"
   }
   else{
       return "Square"
   }
    
}
 let gameMode = getPreferredGameMode(noOfFriends);
  console.log(gameMode);