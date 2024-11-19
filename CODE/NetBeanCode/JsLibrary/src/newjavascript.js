/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

  let total = 0;
  let arrayOfScores=[20,40,89,90];
  
function calculateTotalScore()
{
    for( let x = 0 ; x< arrayOfScores.length; x++)
    {
        total = total+ arrayOfScores[x];
       
    }
    console.log(total);
    return total;
}
let output =  calculateTotalScore();
console.log(output);
 


