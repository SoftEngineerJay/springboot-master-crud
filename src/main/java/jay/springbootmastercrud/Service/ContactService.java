package jay.springbootmastercrud.Service;

import jay.springbootmastercrud.Models.Contact;

public interface ContactService {
    Iterable<Contact> getAllContact();
    Contact getContactById(Integer id);
    Contact saveContact(Contact contact);
    void deleteContact(Integer id);
}
