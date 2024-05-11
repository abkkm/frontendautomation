'''
>>> from hashing import Hasher
>>> Hasher.get_hash_password("mypassword")
>>>> Hasher.verify_password("mypassword","jhhghjghg")
true
'''

from passlib.context import CryptContext

pwd_context = CryptContext(schemes=["bcrypt"], deprecated="auto")


class Hasher:
    @staticmethod
    def get_hash_password(plain_password):
        return pwd_context.hash(plain_password)

    @staticmethod
    def verify_password(plain_password, hash_password):
        return pwd_context.verify(plain_password, hash_password)