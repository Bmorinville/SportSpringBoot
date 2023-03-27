package com.example.sportstats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired //tells spring to inject the customerRepository bean, which is implemented from the repository interface
    private TeamsRepository teamsRepository;

    @PostMapping("/add") //annotation maps the addCustomer() method to POST requests for /add
    public String addTeam(@RequestParam Integer id, @RequestParam String name, @RequestParam Float mp,  @RequestParam Float fg, @RequestParam Float fga, @RequestParam Float fgp,
                          @RequestParam Float thrp, @RequestParam Float thrpa, @RequestParam Float thrpp, @RequestParam Float twp,
                          @RequestParam Float twpa, @RequestParam Float twpp, @RequestParam Float ft, @RequestParam Float fta,
                          @RequestParam Float ftp, @RequestParam Float ofb, @RequestParam Float dfb, @RequestParam Float trb,
                          @RequestParam Float ast, @RequestParam Float stl, @RequestParam Float blk, @RequestParam Float tov,
                          @RequestParam Float pf, @RequestParam Float pts) {
        Team team = new Team();
        team.setId(id);
        team.setName(name);
        team.setMinutesPlayed(mp);
        team.setFieldGoals(fg);
        team.setFieldGoalAttempts(fga);
        team.setFieldGoalPercent(fgp);
        team.setThreePointMade(thrp);
        team.setThreePointAttempts(thrpa);
        team.setThreePointPercent(thrpp);
        team.setTwoPointMade(twp);
        team.setTwoPointAttempts(twpa);
        team.setTwoPointPercent(twpp);
        team.setFreeThrowMade(ft);
        team.setFreeThrowAttempts(fta);
        team.setFreeThrowPercent(ftp);
        team.setOffensiveRebounds(ofb);
        team.setDefensiveRebounds(dfb);
        team.setTotalRebounds(trb);
        team.setAssists(ast);
        team.setSteals(stl);
        team.setBlocks(blk);
        team.setTurnovers(tov);
        team.setPersonalFouls(pf);
        team.setTotalPoints(pts);
        teamsRepository.save(team);
        return "Added new customer to repo";
    }

    @GetMapping("/list") //annotation maps the getCustomers() method to GET requests for /list.
    public Iterable<Team> getTeams() {
        return teamsRepository.findAll();
    }

    @GetMapping("/find/{id}") //annotation maps the findCustomerById() method to GET requests for /find/{id}
    public Team findTeamsById(@PathVariable Integer id){
        return teamsRepository.findTeamsById(id);
    }

}
