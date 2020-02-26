package com.charith.leetcode.AccountsMerge721;

import java.util.*;

public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> res = new ArrayList<>();
        if (accounts.size() == 0) return res;
        Map<String, Set<String>> graph = new HashMap<>();
        Map<String, String> mailToName = new HashMap<>();
        buildGraph(graph, accounts, mailToName);

        Set<String> visited = new HashSet<>();
        for (String mail : mailToName.keySet()) {
            String name = mailToName.get(mail);
            List<String> mails = new ArrayList<>();
            if (visited.add(mail)) {
                dfs(mails, mail, graph, visited);
                Collections.sort(mails);
                mails.add(0, name);
                res.add(mails);
            }
        }

        return res;
    }

    private void dfs(List<String> mails, String mail, Map<String, Set<String>> graph, Set<String> visited) {
        mails.add(mail);
        if (graph.get(mail).size() == 0) return;
        for (String neigh : graph.get(mail)) {
            if (visited.add(neigh)) {
                dfs(mails, neigh, graph, visited);
            }
        }
    }

    private void buildGraph(Map<String, Set<String>> graph, List<List<String>> accounts, Map<String, String> mailToName) {
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String mail = account.get(i);
                mailToName.put(mail, name);
                graph.putIfAbsent(mail, new HashSet<>());
                if (i == 1) continue;
                String prev = account.get(i - 1);
                graph.get(prev).add(mail);
                graph.get(mail).add(prev);
            }
        }
    }
}