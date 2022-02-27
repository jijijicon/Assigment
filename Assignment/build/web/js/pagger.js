/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function pagger(id ,pageindex ,totalpage, gap, gradeid, classid){
    var container = document.getElementById(id);
    var result='';
    if(pageindex-gap>1)
        result+='<a href="../student/search?gradeID='+gradeid+'&classID='+classid+'&page=1">first</a>';
    
    for (var i = pageindex-gap; i<pageindex;i++)
        if(i>0) result+='<a href="../student/search?gradeID='+gradeid+'&classID='+classid+'&page='+i+'">'+i+'</a>';
    
    
    result+='<span>'+pageindex+'</span>';
    for (var i = pageindex+1; i<=pageindex+gap;i++)
        if(i<=totalpage) result+='<a href="../student/search?gradeID='+gradeid+'&classID='+classid+'&page='+i+'">'+i+'</a>';
    

    if(pageindex+gap<totalpage)
        result+='<a href="../student/search?gradeID='+gradeid+'&classID='+classid+'&page='+totalpage+'">last</a>';
    
    container.innerHTML = result;
}

