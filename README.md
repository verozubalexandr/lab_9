# lab_9

(1)
Создаем классы, которые содержат поля полученной из api строки, для их дальнейшего быстрого < и в написании тоже:) > преобразования в объект Java
(2)
Случайным образом генерируем запросы api (используя случайные координаты места в определенном диапазоне)
(3)
Создаем сортировки по текущей температуре, скорости ветра, высоте местности
(4)
Создаем поиск по коду погоды(int) который можно сопоставить со словесным описанием погоды при попмощи документации на сайте 
(в дальнейшем для расшифровки можно использовать switch)\n\n\n\n\n

*Таблица соответствий кодов и описаний погоды*
0             ->     Clear sky
1, 2, 3	      ->     Mainly clear, partly cloudy, and overcast
45, 48	      ->     Fog and depositing rime fog
51, 53, 55  	->     Drizzle: Light, moderate, and dense intensity
56, 57	      ->     Freezing Drizzle: Light and dense intensity
61, 63, 65  	->     Rain: Slight, moderate and heavy intensity
66, 67	      ->     Freezing Rain: Light and heavy intensity
71, 73, 75  	->     Snow fall: Slight, moderate, and heavy intensity
77	          ->     Snow grains
80, 81, 82  	->     Rain showers: Slight, moderate, and violent
85, 86	      ->     Snow showers slight and heavy
95            ->     Thunderstorm: Slight or moderate
96, 99        ->     Thunderstorm with slight and heavy hail
