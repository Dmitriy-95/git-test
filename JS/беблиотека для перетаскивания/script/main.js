

$(init);

function init() {
    $("#click_block").draggable({
//        опция:значение,
//        опция:значение,
//        опция:значение
        
        containment: 'parent',
        cursor:'move'  
    });
    
    $("#second_block").draggable({

        containment: 'document',
        cursor:'move',
        helper:myhelper,
        stop: dragStop
    });
    
    $("#right_block").droppable({
        drop: dropEvent
    });
    
}

function myhelper (){
    return "<div id='drigHelp'> вспомогательный блк </div>"
}
    

function dragStop (event,ui){
//    обьект события (event)
//    обьект JQuert UI который перетаскивает элемент(ui)
    
    var setposX = parseInt(ui.offset.left);
    var setposY = parseInt(ui.offset.top);
    
    alert('перетаскивание завершено' + setposX + setposY);
}


function dropEvent(event,ui){
    var drog = ui.draggable;
    alert("обьект, ID" + drog.attr('id') + "доставлен в целеваое окно");
}






























































