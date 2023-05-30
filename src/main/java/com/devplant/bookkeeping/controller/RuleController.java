package com.devplant.bookkeeping.controller;

import com.devplant.bookkeeping.model.Rule;
import com.devplant.bookkeeping.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @GetMapping("/rules/{ruleId}")
    public Rule getRuleById(@PathVariable String ruleId) {
        return ruleService.getRuleById(ruleId);
    }

    @GetMapping("/rules")
    public List<Rule> getRules() {
        return ruleService.getRules();
    }

    @PostMapping("/rules")
    public Rule createRule(@RequestBody Rule rule) {
        return ruleService.createRule(rule);
    }

    @PutMapping("/rules/{ruleId}")
    public Rule updateRule(@RequestBody Rule rule, @PathVariable String ruleId) {
        return ruleService.updateRule(rule, ruleId);
    }

    @DeleteMapping("/rules/{ruleId}")
    public void deleteRule(@PathVariable String ruleId) {
        ruleService.deleteRule(ruleId);
    }
}
