package com.frank.service.impl;

import com.frank.dto.ProjectDTO;
import com.frank.entity.Project;
import com.frank.mapper.ProjectMapper;
import com.frank.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {

    @Mock
    ProjectRepository projectRepository;

    @Mock
    ProjectMapper projectMapper;

    @InjectMocks
    ProjectServiceImpl projectService;

    @Test
    void getProjectCode_test(){

        //Given
        Project project = new Project();
        ProjectDTO projectDTO = new ProjectDTO();

        when(projectRepository.findByProjectCode(anyString())).thenReturn(project);
        when(projectMapper.convertToDto(project)).thenReturn(projectDTO);

        //When
        ProjectDTO projectDTO1 = projectService.getByProjectCode(anyString());

        //Then
        verify(projectRepository).findByProjectCode(anyString());
        verify(projectMapper).convertToDto(any(Project.class));

        assertNotNull(projectDTO1);

    }

    @Test
    void getProjectCode_exception_test(){
        when(projectRepository.findByProjectCode("")).thenThrow(new RuntimeException("Project Not Found!"));

        Throwable exception = assertThrows(RuntimeException.class, () -> projectService.getByProjectCode(""));

        verify(projectRepository).findByProjectCode(anyString());

        assertEquals(exception.getMessage(), "Project Not Found!");
    }

    @Test
    void save_test(){

        ProjectDTO projectDTO = new ProjectDTO();
        Project project = new Project();

        when(projectMapper.convertToEntity(projectDTO)).thenReturn(project);
        when(projectRepository.save(project)).thenReturn(project);

        projectService.save(projectDTO);

        verify(projectRepository).save(project);
        verify(projectMapper).convertToEntity(any(ProjectDTO.class));
    }
}