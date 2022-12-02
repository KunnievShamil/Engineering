package com.example.engineering.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.engineering.data.entitys.Project
import com.example.engineering.data.repositories.ProjectsRepository

class DashboardViewModel : ViewModel() {

    private lateinit var projectsRepository: ProjectsRepository

    init {
        ProjectsRepository.init()
        projectsRepository = ProjectsRepository.get()
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    fun getProjectList() : List<Project> = projectsRepository.getProjectList()
}
