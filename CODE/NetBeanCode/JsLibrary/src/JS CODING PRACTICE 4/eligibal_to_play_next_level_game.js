/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

 

  function isEligibleForNextLevel(person) {
      
      let x = person.score;
     
      if(x >= 5)
      {
         return true;
      }
      else{
          return false;
      }
     
    /** Write your code here and return the output */
  }
 
  let person ={
      name:"ritik sharma",
      score:10
  }
  let isPersonEligible = isEligibleForNextLevel(person);
  console.log(isPersonEligible);

