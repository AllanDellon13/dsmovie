import { ReactComponent as GitHubIcon } from 'assets/img/github.svg';

import './styles.css';

//componente criado e chama em App.tsx
function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/AllanDellon13">
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contact-link">/allandellon13</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>

    )

}

export default Navbar;