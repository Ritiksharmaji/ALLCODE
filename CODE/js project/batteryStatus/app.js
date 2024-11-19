function updateChargingStatus(battery) {

    document.getElementById("battery-level").textContent = `${battery.level * 100}%`


    document.getElementById("charging-status").textContent = `${battery.charging ?
        'Yes' : 'No'}`
}









navigator.getBattery().then(function (battery) {
    console.log(battery)
    updateChargingStatus(battery)
    // event listener for the battery api
    battery.addEventListener("chargingchange", function () {
        updateChargingStatus(battery)
    })

    battery.addEventListener("chargingtimechange", function () {
        updateChargingStatus(battery)
    })
})