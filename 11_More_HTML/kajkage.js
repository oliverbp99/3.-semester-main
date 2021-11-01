/*const list = [1, 2, 3, 4, 5]

const squaredList = list.map(number => number * number)

const isOdd = list.filter(number => number % 2 !== 0)
console.log(isOdd)*/



const kajkager = [{
    type: "Andrea",
    color: "blue",
    deliciosness: 8
}
];

kajkager.push({
    type: "BO",
    color: "blue",
    deliciosness: 8
}
);



console.log(kajkager)

const tbodyElement = document.getElementById("cake-tbody");

const hardCaketData = {
    type: "Kaj",
    color: "green",
    deliciosness: 10
}

kajkager.map(cake => {
    const tableRowElement = document.createElement("tr");

    tableRowElement.innerHTML = `
            <td>${escapeHTML(cake.type)}</td>
            <td>${escapeHTML(cake.color)}</td>
            <td>${escapeHTML(cake.deliciosness.toString())}/10</td>
`;
    tbodyElement.appendChild(tableRowElement);
});
