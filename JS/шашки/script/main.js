$(init);

function init(){
    
    var numbers = [1,2,3,4,5,6,7,8,9,10]; 
    
    $('#Pile').html();
    $('#Slot').html();
//    создание случайного набора карт
    
    numbers.sort(function(){
                 
                 return Math.random() - .2;
                 
                 });

/* 
   Проходим циклом по массиву numbers и ссоздаем блок для каждого числа
   В данном блоке div мы размещаем число,которое появляется в блоке
   Как только объект div создан, мы сохраняем номер блока с ключом 'number'
   в объекте с помощью метода data().
 Далее задаем для блока div id в виде 'block n', n - номер блока.
 Это нужно чтобы установить разные стиили для блоков через css 
   */

    for (var i=0; i <10; i++){
        
        $('<div>'+numbers[i]+'</div>').data('number',numbers[i]).attr( 'id', 'card'+ numbers[i]).appendTo('#cardPile').draggable({
            containment:'#content',
            cursor:'move',
            revert:true
        });
        
    }

//    создаем слоты для карты
    
    var content = ['один','два','три','четыре','пять','шеть','семь','восемь','девять','десять'];
  for ( var i=1; i<=10; i++) {
      $('<div>' + content[i-1] +'</div>').data('number',i).attr('id','card_slot'+content[i]).appendTo("#cardSlots").droppable({
          accept:'#cardPile div', //слоты принимают только указанные блоки
          hoverClass:'hovered', //устанавливаем класс CSS для слота приемника,
          drop:dropEvent
      });
  }
    

//    $(".ui-draggable").draggable({
//        containment: '#content', // ограничение перетаскивание оберточным блоком
//        cursor: 'move', // внешний вид курсора
//        revert: true  // возврат элемента при  отжатии в исходное положение
//        
//    });
//    
//    $(".ui-droppabl").droppable({
//        drop: handleCardDrop    // drop возникает при отпускании элемента на приемником
//        
//    });
    
}

function handleCardDrop (even,ui){
    
    var slotNumber = 1;
    var cardNumber = 1;
    
//    если карта была брошена на правельный слот изменяем 
//    ее цвет опускаем ее на приемник
//    и предотвращаем ее повторное перетаскивание
    
    if (slotNumber == cardNumber){
        ui.draggable.addClass('correct');
        ui.draggable.draggable('disable');
        $(this).droppable('disable');
//        отключает свойство приемника на данном окне приемнике
        
        ui.draggable.position( { of: $(this), my: 'left top', at: 'left top' } );
//        позиционирует элемент в верхнем левом углу окна приемника
        
        ui.draggable.draggable('option' , 'revert' , false);
//        отключаем возвращение элемента в начальное окно
    }
    
}


























































