package com.example.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";  // ログインページへの遷移
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // ここに認証ロジックを追加（例: DBに対してユーザー名・パスワードをチェック）
        
        if ("admin".equals(username) && "password".equals(password)) {
            // ログイン成功時
            return "redirect:/home"; // ログイン後の遷移先
        } else {
            // ログイン失敗時
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
