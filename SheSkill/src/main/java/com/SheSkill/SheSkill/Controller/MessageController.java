package com.SheSkill.SheSkill.Controller;

import com.SheSkill.SheSkill.Service.MessageService;
import com.SheSkill.SheSkill.model.messages;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("allMessages")
    public List<messages> getAllMessages()
    {
        return messageService.getAllMessages();
    }

    @PostMapping("add")
    public String addUser(@RequestBody messages message)
    {
        return messageService.addMesage(message);
    }
    @PutMapping("update")
    public String updateUser(@RequestBody messages message)
    {
        return messageService.updateMessage(message);
    }
    @DeleteMapping("delete")
    public String deleteUser(@RequestBody messages message)
    {
        return messageService.deleteMessage(message);
    }

}
