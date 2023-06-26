package jay.springbootmastercrud.Service;

import jay.springbootmastercrud.Models.Contact;
import jay.springbootmastercrud.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Iterable<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Integer id){
        return this.contactRepository.findOne(id);
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Integer id) {
        this.contactRepository.delete(getContactById(id));
    }
}
