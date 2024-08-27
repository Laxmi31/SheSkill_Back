package com.SheSkill.SheSkill.Service;

import com.SheSkill.SheSkill.dao.MessageDao;
import com.SheSkill.SheSkill.model.messages;
import com.SheSkill.SheSkill.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageDao messageDao;
    public List<messages> getAllMessages() {
            return messageDao.findAll();
    }

    public String addMesage(messages message) {
        messageDao.save(message);
        return "Inserted successfully";
    }

    public String updateMessage(messages message) {
        messageDao.save(message);
        return "Updated successfully";
    }

    public String deleteMessage(messages message) {
        messageDao.delete(message);
        return "Deleted successfully";
    }
}
