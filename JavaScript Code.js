function shuffle(line, indices)
{
    var newLine = line;
    newLine = newLine.split('');
    line  = line.split('');
    for(let i=0; i<indices.length; i++)
    {
        newLine[indices[i]]=line[i];
    }
    newLine = newLine.join('');
    console.log("After shuffling: "+newLine);
}
var flag = true;
var indices = [];
const line = prompt("Enter a string: ");
for(let i = 0; i<line.length; i++)
{
    var index = prompt("Enter index no."+(i+1)+": ");
    if(index > (line.length-1))
    {
        console.log("Out of range value\n");
        flag = false;
        break;
    }
    else
    {
        indices.push(index);
    }
}
if(flag)
{
    console.log("The entered string is: "+line);
    shuffle(line, indices);
}