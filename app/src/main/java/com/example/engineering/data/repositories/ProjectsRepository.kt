package com.example.engineering.data.repositories

import com.example.engineering.data.entitys.Project

class ProjectsRepository private constructor() {


 fun getProjectList() :List<Project>  = listOf(
     Project("https://static.tildacdn.info/tild6161-6664-4230-a239-306433306138/_.jpg","1. Бегущий огонек","Зажигает светодиоды на разных скоростях в зависимости от введенных показаний в программу."),
     Project("https://static.tildacdn.info/tild6432-3862-4030-b466-353264656634/photo.jpg","2. Секундомер","Базовый секундомер, начинающий отсчет от нажатия кнопки."),
     Project("https://static.tildacdn.info/tild6330-6533-4433-a334-633436373961/1.jpg","3. Тренер","Выводит на экран сообщение о принятия пищи и тренировках через определенное время."),
     Project("https://static.tildacdn.info/tild3439-3730-4236-b563-636366386231/photo.jpg","4. Цветная температура","В зависимости от температуры включает светодиоды (красный - тепло, синий - холодно)"),
     Project("https://static.tildacdn.info/tild3364-3538-4061-b664-663665656430/5.jpg","5. Метеостанция","Измеряет температуру и влажность окружающей среды и выводит на экран."),
     Project("https://static.tildacdn.info/tild6431-3765-4538-a233-366436346665/_.jpg","6. Ультразвуковой датчик расстояния HR-S04","При изменении расстояния от предмета выводит сообщение на экран."),
     Project("https://static.tildacdn.info/tild6533-3265-4932-b762-643937323239/photo.jpg","7. Транзистор MOSFET.","Базовый секундомер, начинающий отсчет от нажатия на кнопку."),
     Project("https://static.tildacdn.info/tild6662-6561-4638-a538-623331303137/photo.jpg","8. Фоторезистор.","При изменении освещенности зажигает и гасит светодиоды."),
     Project("https://static.tildacdn.info/tild3466-3934-4666-a162-306462306332/_.jpg","9. Управление Pan/TiltBracket с помощью джойстика.","Изменение направления оборота движения лопастей с помощью джойстика."),
     Project("https://static.tildacdn.info/tild3437-3532-4533-b934-316563336433/10__.jpg","10. Датчик газа.","В зависимости от концентрации газа/запаха в воздухе зажигает/гасит светодиод."),
     Project("https://static.tildacdn.info/tild6533-3265-4932-b762-643937323239/photo.jpg","11. Игра в последователь-ность.","Игра, суть которой повторить последовательность светодиодов."),
     Project("https://static.tildacdn.info/tild6662-6561-4638-a538-623331303137/photo.jpg","12. Светофоры на перекрестке.","Поочередно переключаются светофоры, имитируя регулировку движения на перекрестке."),
     Project("https://static.tildacdn.info/tild3466-3934-4666-a162-306462306332/_.jpg","13. Парктроник.","При изменении расстояния от объекта начинает пищать пьезоэлемент с соответствующей частотой."))


    companion object{
        private var INSTANSE : ProjectsRepository? = null

        fun init(){
            if (INSTANSE == null){
                INSTANSE = ProjectsRepository()
            }
        }

        fun get() : ProjectsRepository{
            if (INSTANSE != null) {
                return INSTANSE!!
            }
             else throw Exception("Init ProjectsRepository")
        }
    }
}