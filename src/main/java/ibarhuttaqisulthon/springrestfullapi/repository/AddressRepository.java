package ibarhuttaqisulthon.springrestfullapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ibarhuttaqisulthon.springrestfullapi.entity.Address;
import ibarhuttaqisulthon.springrestfullapi.entity.Contact;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    Optional<Address> findFirstByContactAndId(Contact contact, String id);

    List<Address> findAllByContact(Contact contact);
}
