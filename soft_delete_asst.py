from datetime import datetime, timezone


class Donor:

    donors = []

    def _init_(self, name: str) -> None:
        self.__name = name
        self.__is_deleted = False
        self.__deleted_at = None
        Donor.donors.append(self)

    def soft_delete(self) -> None:
        self.__is_deleted = True
        self.__deleted_at = datetime.now(tz=timezone.utc)

    @property
    def name(self) -> str:
        return self.__name

    @property
    def is_deleted(self) -> bool:
        return self.__is_deleted

    @property
    def deleted_at(self) -> datetime:
        return self.__deleted_at

    def _repr_(self) -> str:
        return f"<{self._class.name} {self._name}"



donor_1 = Donor(name="UNICEF")
donor_2 = Donor(name="USAID")
donor_3 = Donor(name="JICA")

print(Donor.donors)