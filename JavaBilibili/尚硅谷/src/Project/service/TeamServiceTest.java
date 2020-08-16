package Project.service;

import Project.domain.Programmer;
import org.junit.Test;

import static org.junit.Assert.*;
public class TeamServiceTest
{

    TeamService teamService = new TeamService();

    @Test
    public void getTeam()
    {
        Programmer[] team = teamService.getTeam();
    }

    @Test
    public void addMember()
    {
    }

    @Test
    public void removeMember()
    {
    }
}