/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

function main() {
  // objectKey
  let objectKey = year;
  // arrayOfInventions
  let arrayOfInventions = [
    {
      name: "Printing Press",
      "invented by": "Johannes Gutenberg",
      year: 1440
    },
    {
      name: "Light Bulb",
      "invented by": "Thomas Edison",
      year: 1879
    },
    {
      name: "Telephone",
      "invented by": "Alexander Graham Bell",
      year: 1876
    },
    {
      name: "Aeroplane",
      "invented by": "Orville and Wilbur Wright",
      year: 1903
    },
    {
      name: "Computer",
      "invented by": "Charles Babbage",
      year: 1822
    }
  ];
let x=0;
let object;
while(x !== arrayOfInventions.length)
{
    object = arrayOfInventions[x];
    console.log(object[objectKey]);
    x++;
}

 
}
