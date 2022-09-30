<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="UTF-8">
    <script type="text/javascript" 
    src="https://www.gstatic.com/charts/loader.js"></script>


    <script type="text/javascript">
      //google에서 기본 차트 관련된 package(모듈)명
      //chart 종류에 따라서 google 개발 문서 참조 필수
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        //2차원 배열로 데이터 처리
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          ['작업',     11], //원하는대로 데이터 내용 바꾸어 사용
          ['Eat',      2],
          ['Commute',  2],
          ['Watch TV', 2],
          ['Sleep',    7]
        ]);

        /* options 변수명은 다른 변수명으로 선언 및 사용 가능
           title 속성 : 구글 차트에서 title로 사용되는 정보이기 때문에 속성명 수정 불가, 구글 차트가 제공하는 이름
        */
        var options = {
          title: '나의 하루 일과'
        };

        //어떤 위치에 chart를 표현할 것인지에 대한 html tag 정보 반영
        //<div id="piechart" style="width: 900px; height: 500px;"></div>
        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
		
      	//data와 option값을 적용하여 chart 그리기
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart" style="width: 900px; height: 500px;"></div> //pieChart가 적용되는 위치
  </body>
</html>
